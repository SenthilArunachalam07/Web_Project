package com.SchoolMarkListManagementSystem.WebProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Course;

public interface CourseRepository extends JpaRepository<Course, String>{

}
