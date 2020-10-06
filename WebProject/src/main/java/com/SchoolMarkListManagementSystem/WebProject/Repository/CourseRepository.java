package com.SchoolMarkListManagementSystem.WebProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Course;

public interface CourseRepository extends JpaRepository<Course, String>{

	@Transactional
	@Modifying
	@Query("update Course c set c.category=?1 where c.couId=?2")
	public int updateCourseCategory(String category,String couId);
}
