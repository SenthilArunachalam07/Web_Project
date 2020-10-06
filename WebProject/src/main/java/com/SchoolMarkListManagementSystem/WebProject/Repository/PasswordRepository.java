package com.SchoolMarkListManagementSystem.WebProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SchoolMarkListManagementSystem.WebProject.Domains.PassTableStaff;

public interface PasswordRepository extends JpaRepository<PassTableStaff, Integer>{

	@Query("select pass from PassTableStaff pass where pass.staffId=?1 and pass.pass=?2")
	List<PassTableStaff> getUser(String staffId,String pass);
}
