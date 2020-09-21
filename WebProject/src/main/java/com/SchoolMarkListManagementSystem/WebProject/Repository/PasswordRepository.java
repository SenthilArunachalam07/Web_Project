package com.SchoolMarkListManagementSystem.WebProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolMarkListManagementSystem.WebProject.Domains.PassTableStaff;

public interface PasswordRepository extends JpaRepository<PassTableStaff, Integer>{

}
