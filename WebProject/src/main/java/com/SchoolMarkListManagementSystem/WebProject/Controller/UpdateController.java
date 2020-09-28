package com.SchoolMarkListManagementSystem.WebProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Student;
import com.SchoolMarkListManagementSystem.WebProject.Service.UpdateService;

@SpringBootApplication
@RestController
@CrossOrigin
public class UpdateController {

	@Autowired
	UpdateService updateService;
	
	@PostMapping("/updateStudent")
	public String updateStu(@RequestBody Student student,String value) {
		String upa=updateService.updateStudent(student, value);
		return upa;
	}

}
