package com.SchoolMarkListManagementSystem.WebProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Subjects;

public interface SubjectRepository extends JpaRepository<Subjects, Integer>{

	@Transactional
	@Modifying
	@Query("update Subjects s set s.subName=?1 where s.subId=?2")
	public int updateSubjectName(String subName,int subId);
	
	@Transactional
	@Modifying
	@Query("update Subjects s set s.description=?1 where s.subId=?2")
	public int updateSubjectDescription(String description,int subId);
	
	@Transactional
	@Modifying
	@Query("update Subjects s set s.couId=?1 where s.subId=?2")
	public int updateSubCourse(String couId,int subId);
}
