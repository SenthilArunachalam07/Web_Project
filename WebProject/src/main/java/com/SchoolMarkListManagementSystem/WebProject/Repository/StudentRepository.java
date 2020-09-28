package com.SchoolMarkListManagementSystem.WebProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Student;

public interface StudentRepository extends JpaRepository<Student, String>{
	
	@Transactional
	@Modifying
	@Query("update Student s set s.address=?1 where s.stdId=?2")
	public int updateStudentAddress(String address,String stdId);
	
	@Transactional
	@Modifying
	@Query("update Student s set s.mobileNum=?1 where s.stdId=?2")
	public int updateStudentMobile(String mobileNum,String stdId);
}  