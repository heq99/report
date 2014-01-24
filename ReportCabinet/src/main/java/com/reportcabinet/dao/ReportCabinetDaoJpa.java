package com.reportcabinet.dao;

import org.springframework.stereotype.Repository;

import com.reportcabinet.domainobjects.ReportCabinet;

@Repository("reportCabinetDao")
public class ReportCabinetDaoJpa extends GenericDaoJpa<ReportCabinet> implements ReportCabinetDao {

	public ReportCabinetDaoJpa() {
		super(ReportCabinet.class);
	}
}
