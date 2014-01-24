package com.reportcabinet.service;

import java.util.List;

import com.reportcabinet.domainobjects.Report;
import com.reportcabinet.domainobjects.ReportCabinet;

public interface ReportCabinetService {

	List<Report> getReports();
	List<ReportCabinet> getSubCabinet();
	
	ReportCabinet getReportCabinetById(Integer id);
	ReportCabinet saveReportCabinet(ReportCabinet reportCabinet);
	ReportCabinet updateReportCabinet(ReportCabinet reportCabinet);
	ReportCabinet deleteReportCabinet(Integer id);
}
