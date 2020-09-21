package com.SchoolMarkListManagementSystem.WebProject.Domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passtablestaff")
public class PassTableStaff {

	@Id
	private int pId;
	
	@Column(name = "staff_id")
	private String staffId;
	
	@Column(name = "Fav_Sport")
	private String favSport;
	
	@Column(name = "Fav_Team")
	private String favTeam;
	
	@Column(name = "Fav_Player")
	private String favPlayer;
	
	@Column(name = "Pass")
	private String pass;
	
	@Column(name = "Re_Pass")
	private String rePass; 
	
	@Column(name = "sourcee")
	private String sourcee;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getFavSport() {
		return favSport;
	}

	public void setFavSport(String favSport) {
		this.favSport = favSport;
	}

	public String getFavTeam() {
		return favTeam;
	}

	public void setFavTeam(String favTeam) {
		this.favTeam = favTeam;
	}

	public String getFavPlayer() {
		return favPlayer;
	}

	public void setFavPlayer(String favPlayer) {
		this.favPlayer = favPlayer;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRePass() {
		return rePass;
	}

	public void setRePass(String rePass) {
		this.rePass = rePass;
	}

	public String getSourcee() {
		return sourcee;
	}

	public void setSourcee(String sourcee) {
		this.sourcee = sourcee;
	}

	
	
	
	
}
