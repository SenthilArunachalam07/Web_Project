package com.SchoolMarkListManagementSystem.WebProject.Domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	@Id
	private String stdId;
	
	@Column(name="Std_Name")
	private String stdName;
	
	@Column(name="D_O_B")
	private String dob;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Fathers_Name")
	private String fatherName;
	
	@Column(name="Mobile_num")
	private String mobileNum;
	
	@Column(name="Mail_ID")
	private String mailId;
	
	@Column(name="II_Language")
	private String language;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="Standard")
	private String standard;

	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
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

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}
}
