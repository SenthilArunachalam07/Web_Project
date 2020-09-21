package com.SchoolMarkListManagementSystem.WebProject.Domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "marktable")
public class MarkTable {
	
	@Id
	private int id;
	
	@Column(name = "Std_id")
	private String stdId;
	
	@Column(name = "Sub_id")
	private int subId ;
	
	@Column(name = "term_id")
	private int termId ;
	
	@Column(name = "mark")
	private int mark ;
	
	@Column(name = "Examination_date")
	private String examinationDate;
	
	@Column(name = "Standard")
	private String standard;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public int getTermId() {
		return termId;
	}

	public void setTermId(int termId) {
		this.termId = termId;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getExaminationDate() {
		return examinationDate;
	}

	public void setExaminationDate(String examinationDate) {
		this.examinationDate = examinationDate;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	
}
