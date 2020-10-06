package com.SchoolMarkListManagementSystem.WebProject.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Course;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Staff;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Student;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Subjects;
import com.SchoolMarkListManagementSystem.WebProject.Service.UpdateService;

@SpringBootApplication
@RestController
@CrossOrigin
public class UpdateController {

	@Autowired
	UpdateService updateService;
	
	@PostMapping("/updateStudent")
	public String updateStu(@RequestBody Student student) {
		String upa = null;
		if(student.getAddress() != null) {
			upa=updateService.updateStudent(student);
		}else if(student.getMobileNum() != null) {
			upa=updateService.updateStudentMobile(student);
		}else if(student.getMailId() != null) {
			upa=updateService.updateStudentMail(student);
		}
		else {
			upa=updateService.updateStudentLang(student);
		}
		return upa;
		
	}
	
	@PostMapping("/updateStaff")
	public String updateStaff(@RequestBody Staff staff) {
		String upd=null;
		if(staff.getAddress() != null) {
			upd=updateService.updateStaffAdd(staff);
		}else if(staff.getMobileNum() != null) {
			upd=updateService.updateStaffMobile(staff);
		}else {
			upd=updateService.updateStaffMail(staff);
		}
		return upd;
	}
	
	@PostMapping("/updateSubject")
	public String updateSubject(@RequestBody Subjects subject) {
		String ups=null;
		if(subject.getSubName() != null) {
			ups=updateService.updateSubName(subject);
		}else if (subject.getDescription() != null) {
			ups=updateService.updateSubDesc(subject);
		}else {
			ups=updateService.updateSubCourse(subject);
		}
		return ups;
	}
	
	@PostMapping("/updateCourse")
	public String updateCourse(@RequestBody Course course) {
		String upc=updateService.updateCourseCategory(course);
		return upc;
	}

}
