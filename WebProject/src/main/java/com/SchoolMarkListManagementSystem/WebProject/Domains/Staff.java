package com.SchoolMarkListManagementSystem.WebProject.Domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {
	
	@Id
	private String StfId;
	
	@Column(name="Stf_Name")
	private String StfName;
	
	@Column(name="D_O_B")
	private String dob;  
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Mobile_num")
	private String mobileNum;
	
	@Column(name="Mail_ID")
	private String mailId;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="Qualification")
	private String qualification;

	public String getStfId() {
		return StfId;
	}

	public void setStfId(String stfId) {
		StfId = stfId;
	}

	public String getStfName() {
		return StfName;
	}

	public void setStfName(String stfName) {
		StfName = stfName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
}
