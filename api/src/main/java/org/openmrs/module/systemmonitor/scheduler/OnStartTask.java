package org.openmrs.module.systemmonitor.scheduler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.AdministrationService;
import org.openmrs.api.context.Context;
import org.openmrs.api.context.ContextAuthenticationException;
import org.openmrs.module.systemmonitor.api.SystemMonitorService;
import org.openmrs.scheduler.SchedulerConstants;
import org.openmrs.scheduler.tasks.AbstractTask;

public class OnStartTask extends AbstractTask {

	protected Log log = LogFactory.getLog(getClass());

	@Override
	public void execute() {
		authenticateHack();
		Context.getService(SystemMonitorService.class).transferDHISMappingsAndMetadataFileToDataDirectory();
		Context.getService(SystemMonitorService.class).updateLocallyStoredDHISMetadata();
		Context.getService(SystemMonitorService.class)
				.updateNumberOfSecondsAtOpenMRSStartup(System.currentTimeMillis() / 1000);
		Context.closeSession();
	}

	protected void authenticateHack() {
		try {
			try {
				Context.openSession();

				AdministrationService adminService = Context.getAdministrationService();
				Context.authenticate(adminService.getGlobalProperty(SchedulerConstants.SCHEDULER_USERNAME_PROPERTY),
						adminService.getGlobalProperty(SchedulerConstants.SCHEDULER_PASSWORD_PROPERTY));
			} catch (ContextAuthenticationException e) {
				log.error("Error authenticating user", e);
			}

		} catch (ContextAuthenticationException e) {
			log.error("Error authenticating user", e);
		}
	}
}