package com.reportcabinet.domainobjects;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the REPORT database table.
 * 
 */
@Entity
@Table(name="REPORT")
@NamedQuery(name="Report.findAll", query="SELECT r FROM Report r")
public class Report implements Serializable, DomainObject {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="Report_ID_Generator", table="ID_TABLE",
			pkColumnName="ID_NAME", valueColumnName="ID_HI",
			pkColumnValue="REPORT_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID")
	private Integer id;

	@Column(name="DESCRIPTION")
	private String description;

	@Column(name="LOCATION")
	private String location;

	@Column(name="NAME")
	private String name;

	//bi-directional many-to-one association to ReportCabinet
	@ManyToOne
	@JoinColumn(name="REPORT_CABINET_ID")
	private ReportCabinet reportCabinet;

	public Report() {
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReportCabinet getReportCabinet() {
		return this.reportCabinet;
	}

	public void setReportCabinet(ReportCabinet reportCabinet) {
		this.reportCabinet = reportCabinet;
	}

}