package com.reportcabinet.domainobjects;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the REPORT_CABINET database table.
 * 
 */
@Entity
@Table(name="REPORT_CABINET")
@NamedQuery(name="ReportCabinet.findAll", query="SELECT r FROM ReportCabinet r")
public class ReportCabinet implements Serializable, DomainObject {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="Report_Cabinet_ID_Generator", table="ID_TABLE",
	               pkColumnName="ID_NAME", valueColumnName="ID_HI",
	               pkColumnValue="REPORT_CABINET_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="Report_Cabinet_ID_Generator")
	@Column(name="ID")
	private Integer id;

	@Column(name="DESCRIPTION")
	private String description;

	@Column(name="NAME")
	private String name;

	//bi-directional many-to-one association to Report
	@OneToMany(mappedBy="reportCabinet")
	private List<Report> reports;

	//bi-directional many-to-one association to ReportCabinet
	@ManyToOne
	@JoinColumn(name="PARENT_ID")
	private ReportCabinet reportCabinet;

	//bi-directional many-to-one association to ReportCabinet
	@OneToMany(mappedBy="reportCabinet")
	private List<ReportCabinet> reportCabinets;

	public ReportCabinet() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public boolean isNew() {
		return this.id==null;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Report> getReports() {
		return this.reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public Report addReport(Report report) {
		getReports().add(report);
		report.setReportCabinet(this);

		return report;
	}

	public Report removeReport(Report report) {
		getReports().remove(report);
		report.setReportCabinet(null);

		return report;
	}

	public ReportCabinet getReportCabinet() {
		return this.reportCabinet;
	}

	public void setReportCabinet(ReportCabinet reportCabinet) {
		this.reportCabinet = reportCabinet;
	}

	public List<ReportCabinet> getReportCabinets() {
		return this.reportCabinets;
	}

	public void setReportCabinets(List<ReportCabinet> reportCabinets) {
		this.reportCabinets = reportCabinets;
	}

	public ReportCabinet addReportCabinet(ReportCabinet reportCabinet) {
		getReportCabinets().add(reportCabinet);
		reportCabinet.setReportCabinet(this);

		return reportCabinet;
	}

	public ReportCabinet removeReportCabinet(ReportCabinet reportCabinet) {
		getReportCabinets().remove(reportCabinet);
		reportCabinet.setReportCabinet(null);

		return reportCabinet;
	}

}