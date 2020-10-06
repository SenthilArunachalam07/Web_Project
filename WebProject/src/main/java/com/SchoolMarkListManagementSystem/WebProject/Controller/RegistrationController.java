package com.SchoolMarkListManagementSystem.WebProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Course;
import com.SchoolMarkListManagementSystem.WebProject.Domains.MarkTable;
import com.SchoolMarkListManagementSystem.WebProject.Domains.PassTableStaff;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Staff;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Student;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Subjects;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Term;
import com.SchoolMarkListManagementSystem.WebProject.Service.RegistrationService;

@SpringBootApplication
@RestController
@CrossOrigin
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping("/")
	public String summa() {
		return "Hello";
	}
	
	@PostMapping("/studentRegistration")
	public String studentRegistration(@RequestBody Student student) {
		String he=registrationService.studentRegistrationForm(student);
		return "Hello "+student.getStdName()+" "+he;
	}
	
	@PostMapping("/staffRegistration")
	public String staffRegistration(@RequestBody Staff staff) {
		String st=registrationService.staffRegistrationForm(staff);
		return "Hello "+staff.getStfName()+" "+st;
	}
	
	@PostMapping("/subjectRegistration")
	public String subjectRegistration(@RequestBody Subjects subject) {
		String sub=registrationService.subjectRegistration(subject);
		return sub;
	}
	
	@PostMapping("/courseRegistration")
	public String courseRegistration(@RequestBody Course course) {
		String cou=registrationService.courseRegistration(course);
		return cou;
	}
	
	@PostMapping("/termRegistration")
	public String termRegistration(@RequestBody Term term) {
		String te=registrationService.termRegistration(term);
		return te;
	}
	
	@PostMapping("/markEntry")
	public String markEntry(@RequestBody MarkTable mark) {
		String ma=registrationService.markEntry(mark);
		return ma;
	}
	
	@PostMapping("/passwordRegistration")
	public String signUpPass(@RequestBody PassTableStaff password) {
		String pas=registrationService.signUp(password);
		return pas;
	}
	
	@PostMapping("/login")
	public String loginForm(@RequestBody PassTableStaff password) {
		String pas=registrationService.login(password);
		return pas;
	}
}
