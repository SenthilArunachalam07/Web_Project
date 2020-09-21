package com.SchoolMarkListManagementSystem.WebProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Student;

public interface StudentRepository extends JpaRepository<Student, String>{
	
}  