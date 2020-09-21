package com.SchoolMarkListManagementSystem.WebProject.Domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {

	@Id
	private String couId;
	
	@Column(name="Category")
	private String category;

	public String getCouId() {
		return couId;
	}

	public void setCouId(String couId) {
		this.couId = couId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
