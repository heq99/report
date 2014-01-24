package com.reportcabinet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reportcabinet.dao.ReportCabinetDao;
import com.reportcabinet.domainobjects.Report;
import com.reportcabinet.domainobjects.ReportCabinet;

@Service("reportCabinetService")
public class ReportCabinetServiceImpl implements ReportCabinetService {
	
	@Autowired
	private ReportCabinetDao reportCabinetDao;

	@Override
	public List<Report> getReports() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReportCabinet> getSubCabinet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportCabinet getReportCabinetById(Integer id) {
		return reportCabinetDao.get(id);
	}

	@Override
	@Transactional
	public ReportCabinet saveReportCabinet(ReportCabinet reportCabinet) {
		return reportCabinetDao.save(reportCabinet);
	}

	@Override
	@Transactional
	public ReportCabinet updateReportCabinet(ReportCabinet reportCabinet) {
		return reportCabinetDao.update(reportCabinet);
	}

	@Override
	@Transactional
	public ReportCabinet deleteReportCabinet(Integer id) {
		return reportCabinetDao.delete(reportCabinetDao.get(id));
	}

}
