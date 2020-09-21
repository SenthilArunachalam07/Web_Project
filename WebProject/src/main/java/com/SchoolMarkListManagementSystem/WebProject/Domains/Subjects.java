package com.SchoolMarkListManagementSystem.WebProject.Domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subjects {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subId;

	@Column(name = "Sub_Name")
	private String subName;

	@Column(name = "Description")
	private String description;

	@Column(name = "Cou_id")
	private String couId;

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCouId() {
		return couId;
	}

	public void setCouId(String couId) {
		this.couId = couId;
	}

}
