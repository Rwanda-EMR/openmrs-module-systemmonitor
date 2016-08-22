package org.openmrs.module.systemmonitor.hacks;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.SystemUtils;
import org.openmrs.module.systemmonitor.SystemMonitorConstants;

public class WindowsMappingsFileNotFoundHack {
	private static String mappings = "## For this tool to report to DHIS/HMIS; DHIS data from the actual DHIS server must be first mapped correctly to much the tool's data"
			+ "\n## This is done through two steps;"
			+ "\n##\tCorrecting mappings for DHIS Data Elements"
			+ "\n##\tCorrecting mappings for Organization Units"
			+ "\n## NOTE: Please only edit the lines in between the -----------------... lines, and only text after the '=' character"
			+ "\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
			+ "\n## MAPPING DHIS DATA ELEMENTS"
			+ "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
			+ "\n## 'emtdataelementcode=dhis-dataelement-id' is the data element format to follow while mapping"
			+ "\n------------------------------------------------------------------------------------"
			+ "\nDATA-ELEMENT_systemId=yBHJmoeteNR"
			+ "\nDATA-ELEMENT_openmrsAppName=ec9fC1xmg8R"
			+ "\nDATA-ELEMENT_primaryCareDays=rb9ef1D53Fv"
			+ "\nDATA-ELEMENT_primaryCareHours=VDEnb2bEQH3"
			+ "\nDATA-ELEMENT_totalEncounters=RYe2tuO9njZ"
			+ "\nDATA-ELEMENT_totalObservations=NorJph8rRjt"
			+ "\nDATA-ELEMENT_totalUsers=GKi8zBGuC3p"
			+ "\nDATA-ELEMENT_totalVisits=nqGCy0uyzm8"
			+ "\nDATA-ELEMENT_totalPatientsNew=aGdN2xl9nUj"
			+ "\nDATA-ELEMENT_totalPatientsActive=hk0HYxaBPtz"
			+ "\nDATA-ELEMENT_openmrsUptime=OBJQIpvppBt"
			+ "\nDATA-ELEMENT_systemUptime-thisWeek=CrZDptrDUqA"
			+ "\nDATA-ELEMENT_systemUptime-lastWeek=h08FIw8cVUD"
			+ "\nDATA-ELEMENT_systemUptime-lastMonth=q9MRIo5DX4I"
			+ "\nDATA-ELEMENT_totalMemory=FRANuyR9bKI"
			+ "\nDATA-ELEMENT_usedMemory=QZMqiNLOZNH"
			+ "\nDATA-ELEMENT_freeMemory=ZPrLSHvWDm8"
			+ "\nDATA-ELEMENT_systemStartupCounts=q8LwlSrBOSj"
			+ "\nDATA-ELEMENT_patientsViralLoadTestResults_ever=AB7Nj3FNvR6"
			+ "\nDATA-ELEMENT_patientsViralLoadTestResults_last6Months=TIdLXyneWYd"
			+ "\nDATA-ELEMENT_patientsViralLoadTestResults_LastYear=D30SnV0TGws"
			+ "\nDATA-ELEMENT_systemInfo_operatingSystemName=CRThksbOPAd"
			+ "\nDATA-ELEMENT_systemInfo_operatingSystemVersion=l76OuWQxBYa"
			+ "\nDATA-ELEMENT_systemInfo_operatingSystemArch=EFfJ4CVvac2"
			+ "\nDATA-ELEMENT_systemInfo_javaVersion=FmjhhJQyLoy"
			+ "\nDATA-ELEMENT_systemInfo_javaVendor=TuBY7HgyJ7J"
			+ "\nDATA-ELEMENT_systemInfo_jvmVersion=RgJN8fbRRuW"
			+ "\nDATA-ELEMENT_systemInfo_jvmVendor=yIMQP0rsprI"
			+ "\nDATA-ELEMENT_systemInfo_javaRuntimeName=SrKrLKmigUg"
			+ "\nDATA-ELEMENT_systemInfo_javaRuntimeVersion=ixpB1MGxTOt"
			+ "\nDATA-ELEMENT_systemInfo_userName=KiOmWTYmc4F"
			+ "\nDATA-ELEMENT_systemInfo_systemLanguage=RHNugiFzCnz"
			+ "\nDATA-ELEMENT_systemInfo_systemTimezone=GldPX7AtrxQ"
			+ "\nDATA-ELEMENT_systemInfo_systemDateTime=vXlzpA8wi6K"
			+ "\nDATA-ELEMENT_systemInfo_fileSystemEncoding=RlDJSS2SRXL"
			+ "\nDATA-ELEMENT_systemInfo_userDirectory=Fy0lelr1WAB"
			+ "\nDATA-ELEMENT_systemInfo_tempDirectory=FveZHUNsC1o"
			+ "\nDATA-ELEMENT_systemInfo_openMRSVersion=Gnpcar514A3"
			+ "\nDATA-ELEMENT_systemInfo_installedModules=ICTGPRAVZVZ"
			+ "\nDATA-ELEMENT_systemRealLocation=hKJXqpumYZ6"
			+ "\nDATA-ELEMENT_patientsCD4CountTestResults_ever=UEfoD5rcZbC"
			+ "\nDATA-ELEMENT_patientsCD4CountTestResults_last6Months=d3XqMIFIoz6"
			+ "\nDATA-ELEMENT_patientsCD4CountTestResults_LastYear=GHq0YsrAsaf"
			+ "\nDATA-ELEMENT_serverUptimeSecs=RiyIySUEl1W"
			+ "\nDATA-ELEMENT_openmrsUptimeSecs=WdPwtuNKhcd"
			+ "\nDATA-ELEMENT_processor=xr3kif2Vuzu"
			+ "\nDATA-ELEMENT_newEncounters=oUoKdxhelRG"
			+ "\nDATA-ELEMENT_newObservations=BHXAiiCvX5K"
			+ "\nDATA-ELEMENT_newUsers=luKfl7hZZek"
			+ "\nDATA-ELEMENT_newEncounters_adultinitial=HkctO4QQgte"
			+ "\nDATA-ELEMENT_newEncounters_adultreturn=aHYdS1cNuam"
			+ "\nDATA-ELEMENT_newEncounters_predsinitial=UidOuL65vMw"
			+ "\nDATA-ELEMENT_newEncounters_pedsreturn=CdlLkU6tqSX"
			+ "\nDATA-ELEMENT_patientsCD4CountTestResults_new=QoIyYyc7Z36"
			+ "\nDATA-ELEMENT_patientsViralLoadTestResults_new=uaUc1zJbaEC"
			+ "\nDATA-ELEMENT_dataForLastBackup=v3Pww13i2r1"
			+ "\nDATA-ELEMENT_newTotalPatientsNew=JNsXijeCdIx"
			+ "\nDATA-ELEMENT_newTotalPatientsActive=GCC9L1LGFBH"
			+ "\n------------------------------------------------------------------------------------"
			+ "\n\n"
			+ "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
			+ "\n## MAPPING DHIS SUPPORTED ORGANISATION UNITS"
			+ "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
			+ "\n## fosaid=dhis2uID is the format each mapping must follow (fosaid is the unique server Id that needs to be mapped to an existing DHIS UID)"
			+ "\n## This list is provided as part of the Study Sites/servers by the Rwanda SPU study team"
			+ "\n## The last mapping whose fosid is JEMBI is for the Jembi test environment"
			+ "\n------------------------------------------------------------------------------------"
			+ "\n107=BQ6Kvt02NYY"
			+ "\n1103=ugY1922BR55"
			+ "\n113=CeUh4uCoQ3A"
			+ "\n118=oyCnY8ItZ63"
			+ "\n120=j2qbe5TmxKy"
			+ "\n121=bFxvEvBCL0T"
			+ "\n122=kFdoH8Wp4HN"
			+ "\n125=gFxLFth8Aw4"
			+ "\n125=gFxLFth8Aw4"
			+ "\n142=hFG3GjDpSz7"
			+ "\n143=gCwAtxRPHGq"
			+ "\n147=NKQShbA52bc"
			+ "\n149=WskKjxqBH5P"
			+ "\n150=Hkp8eisYz6j"
			+ "\n151=CeVJXduK0fn"
			+ "\n155=lBxkzBuDuyp"
			+ "\n158=ueEKzJwO9kf"
			+ "\n159=I61dQKlZ8G0"
			+ "\n16=efJxdTem7M4"
			+ "\n160=hls3zLeUGFu"
			+ "\n163=XtvkcthcT44"
			+ "\n166=ikqbiLMmE6i"
			+ "\n167=MyQyCgynZ37"
			+ "\n170=q1FwOQo9waZ"
			+ "\n171=AR4WkJpbDcc"
			+ "\n177=RzuhrNxCAvJ"
			+ "\n178=uWAq817TIeO"
			+ "\n179=HkPQKvi8EqL"
			+ "\n181=xfXOundWGw5"
			+ "\n183=jaQ4DmKUghP"
			+ "\n186=hV87OCHgO4v"
			+ "\n187=Oy3YrOJMyWk"
			+ "\n188=tO9CpvxsTx1"
			+ "\n192=v5QtLCZMN61"
			+ "\n193=xJ1Y6sH5yoD"
			+ "\n194=fmkyYI7d0Jy"
			+ "\n195=ryHi2WBeo4a"
			+ "\n196=WW8hkYaxybD"
			+ "\n197=rnM981srks2"
			+ "\n2=fGha3KRGmC8"
			+ "\n201=cbQ7xglzZf1"
			+ "\n203=XPVy8lRPJpd"
			+ "\n207=H20elb9Y79s"
			+ "\n212=Z9AtH7XJ1Vg"
			+ "\n217=rZG239wwQkF"
			+ "\n218=o13EyR5whj1"
			+ "\n228=MNBjpiNQ9hi"
			+ "\n230=zOF7aDynhoB"
			+ "\n231=vKwJccfuhYc"
			+ "\n232=uHz1c1Y9xQr"
			+ "\n233=YBXdkoXuynx"
			+ "\n234=MxS4FEL6GSR"
			+ "\n255=lKWdtos0ojO"
			+ "\n256=J0j1xb37YYJ"
			+ "\n258=rcxHfloUczM"
			+ "\n259=NJDkBCeYx9s"
			+ "\n26=k0x0QmE6wah"
			+ "\n260=UatEHyBfTkd"
			+ "\n261=TlW7l2DqCoe"
			+ "\n263=LYUCoyycN16"
			+ "\n264=Km4dwozvoi1"
			+ "\n265=QnxmgSaTMh9"
			+ "\n266=F6yOxGNU4hF"
			+ "\n267=bAACJeoNHYv"
			+ "\n269=NXUwncads4R"
			+ "\n270=GXbNYRE8ZzT"
			+ "\n274=o1d0BbsPhcF"
			+ "\n276=jeiM0yEesl9"
			+ "\n277=ykXMNOjkYG7"
			+ "\n278=mkeeAHOynYc"
			+ "\n279=UhhATkOva0k"
			+ "\n28=Od4EuZl2bbZ"
			+ "\n280=Dfr3u48nJzc"
			+ "\n284=RvcQ2BCQZTM"
			+ "\n285=pU54lCB6csX"
			+ "\n286=FIeQuZdhz5d"
			+ "\n287=uIzwKRz1083"
			+ "\n288=mgrAIR9zEGP"
			+ "\n289=bQvQTtF2qUy"
			+ "\n290=d6luyFEuGqV"
			+ "\n291=bJU4zRNz3ki"
			+ "\n292=cwTLPnF8SgI"
			+ "\n293=eoNeJzh8Gb5"
			+ "\n294=fWkyPlh63iC"
			+ "\n295=PfhIPt8QQIF"
			+ "\n30=DegiMX7LbtQ"
			+ "\n303=KEEVAaerMNe"
			+ "\n304=PsPeDqz42PE"
			+ "\n305=N3irGruOxY7"
			+ "\n307=HPLByDDQ217"
			+ "\n308=FFRc4CJGgBx"
			+ "\n31=eTN5MvbEJFh"
			+ "\n311=DfgrSUXLVPy"
			+ "\n313=eU4vFNj8hVc"
			+ "\n315=xj3nxWJBlfj"
			+ "\n316=X3VDRgqWC8F"
			+ "\n318=H26oBWDLtpe"
			+ "\n319=IPKVjJMPUFU"
			+ "\n320=imxPGApQhH3"
			+ "\n346=ngBAM6yLmd7"
			+ "\n371=I7GoAFV3VXF"
			+ "\n373=Z5vW78TmZqa"
			+ "\n378=qh5wwPStFji"
			+ "\n38=an9nNfwqi5P"
			+ "\n381=s26sIV6A8jW"
			+ "\n383=X9TV6fJEaTU"
			+ "\n385=Fuc8ULAaSyE"
			+ "\n387=zeGIzxjPn63"
			+ "\n389=Nmuo57zTJ"
			+ "\n39=XNpPZhiJsXZ"
			+ "\n393=NcOuLT16U6k"
			+ "\n393=NcOuLT16U6k"
			+ "\n396=djGdJzEZZpL"
			+ "\n399=vxgHAA1aFro"
			+ "\n40=oGMUMam2KTm"
			+ "\n401=tNt9fEFe9tY"
			+ "\n403=fI8jAwkvB93"
			+ "\n41=uho7GYtsuMr"
			+ "\n411=MILfSPTBw8s"
			+ "\n413=RO54JuENSJG"
			+ "\n418=MzSEK3pAhwj"
			+ "\n42=cI9mw2lF62C"
			+ "\n43=B8tFWAvFlQi"
			+ "\n433=L1ejzhqcmOo"
			+ "\n434=UcTsuqZmZEe"
			+ "\n440=lYG6uqBc1p8"
			+ "\n441=O0erNC90LpM"
			+ "\n442=e594asJLvCr"
			+ "\n443=iqEN9xf6ctf"
			+ "\n445=OZwJLEEFr5N"
			+ "\n446=PJ1NM3rTaeZ"
			+ "\n447=BPZcHDS6OO0"
			+ "\n448=i95svNqPM7N"
			+ "\n450=qyyUCb6ULPt"
			+ "\n452=eP4yz4T6tzX"
			+ "\n455=yafuG4eCHLP"
			+ "\n458=q5b1Nm2fo5l"
			+ "\n513=Ko31kixQW69"
			+ "\n52=a7uoL2YrBPl"
			+ "\n545=WKL5mJUTH0u"
			+ "\n551=J6ATf0qwyOP"
			+ "\n56=f0h0G1cDc9P"
			+ "\n57=lJZh1yVIxcS"
			+ "\n58=GcMWyAgltlT"
			+ "\n591=qO8SPTG8SU5"
			+ "\n592=jMVudx1i8rD"
			+ "\n594=PTONcFtEvuM"
			+ "\n62=NUfKga3Otrc"
			+ "\n63=Ge9JH0pz07L"
			+ "\n64=nTUZO3VFS9M"
			+ "\n642=eSHZKaW3za9"
			+ "\n66=R8EQIcE1Dax"
			+ "\n68=dThqqqyqcYY"
			+ "\n69=MTmFtwBz8"
			+ "\n72=ZtTXsxuFh2S"
			+ "\n76=PxVTxBRyI2B"
			+ "\n79=zwQEjVnk7ie"
			+ "\n80=hTpfGsBvZOu"
			+ "\n86=rtDQKWYjVZc"
			+ "\n87=uAIewYJZEq2"
			+ "\n88=tGC8GzJw1WK"
			+ "\n89=T3DlBaAEL6K"
			+ "\n9=Z0mivz38syU"
			+ "\n91=sJGSKHvEPS9"
			+ "\n92=VtHqSAme8CZ"
			+ "\n93=XrYSh1ygwyf"
			+ "\n94=Qp6EM25AmgR"
			+ "\n96=UNpU4eA39Nv"
			+ "\n97=aOFSTk9Ri7k"
			+ "\nJEMBI=vjFcsoL24z5"
			+ "\n------------------------------------------------------------------------------------";
	
	public static void addMappingsFileToSystemMonitorDataDirectory() {
		try {
			if(SystemUtils.IS_OS_WINDOWS)
				FileUtils.writeStringToFile(SystemMonitorConstants.SYSTEMMONITOR_FINAL_MAPPINGFILE, mappings);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
