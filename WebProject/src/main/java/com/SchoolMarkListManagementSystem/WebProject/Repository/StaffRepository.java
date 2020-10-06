package com.SchoolMarkListManagementSystem.WebProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Staff;

public interface StaffRepository extends JpaRepository<Staff, String>{

	@Transactional
	@Modifying
	@Query("update Staff s set s.address=?1 where s.StfId=?2")
	public int updateStaffAddress(String address,String StfId);
	
	@Transactional
	@Modifying
	@Query("update Staff s set s.mobileNum=?1 where s.StfId=?2")
	public int updateStaffMobile(String mobileNum,String StfId);
	
	@Transactional
	@Modifying
	@Query("update Staff s set s.mailId=?1 where s.StfId=?2")
	public int updateStaffMail(String mailId,String StfId);
}
