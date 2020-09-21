package com.SchoolMarkListManagementSystem.WebProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Subjects;

public interface SubjectRepository extends JpaRepository<Subjects, Integer>{

}
