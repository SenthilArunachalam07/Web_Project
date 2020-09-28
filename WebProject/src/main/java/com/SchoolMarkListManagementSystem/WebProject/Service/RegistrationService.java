package com.SchoolMarkListManagementSystem.WebProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Course;
import com.SchoolMarkListManagementSystem.WebProject.Domains.MarkTable;
import com.SchoolMarkListManagementSystem.WebProject.Domains.PassTableStaff;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Staff;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Student;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Subjects;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Term;
import com.SchoolMarkListManagementSystem.WebProject.Repository.CourseRepository;
import com.SchoolMarkListManagementSystem.WebProject.Repository.MarkTableRepository;
import com.SchoolMarkListManagementSystem.WebProject.Repository.PasswordRepository;
import com.SchoolMarkListManagementSystem.WebProject.Repository.StaffRepository;
import com.SchoolMarkListManagementSystem.WebProject.Repository.StudentRepository;
import com.SchoolMarkListManagementSystem.WebProject.Repository.SubjectRepository;
import com.SchoolMarkListManagementSystem.WebProject.Repository.TermRepository;

@Service
public class RegistrationService {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	StaffRepository staffRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	TermRepository termRepository;
	
	@Autowired
	PasswordRepository passwordRepository;
	
	@Autowired
	MarkTableRepository markRepository;
	
	public String studentRegistrationForm(Student student) {
		
		if(studentRepository.save(student) != null) {
			return "Successfully registered the form";
		}else {
			return "Try again";
		}
	}
	
	public String staffRegistrationForm(Staff staff) {
		
		if(staffRepository.save(staff) != null) {
			return "Successfully registered the form";
		}else {
			return "Try again";
		}
	}
	
	public String subjectRegistration(Subjects subject) {
		
		if(subjectRepository.save(subject) != null) {
			return "Successfully registered the Subject";
		}else {
			return "Failed to register the Subject";
		}
	}
	
	public String courseRegistration(Course course) {
		
		if(courseRepository.save(course) != null) {
			return "Successfully registered the course";
		}else {
			return "Failed to register the course";
		}
	}
	
	public String termRegistration(Term term) {
		
		if(termRepository.save(term) != null) {
			return "Successfully added the Term";
		}else {
			return "Failed to add Term";
		}
	}
	
	public String markEntry(MarkTable mark) {
		
		if(markRepository.save(mark) != null) {
			return "Uploaded the Mark";
		}else {
			return "Failed to upload the mark";
		}
	}
	
	public String signUp(PassTableStaff password) {
		
		if(passwordRepository.save(password) != null) {
			return "Update your Account Password";
		}else {
			return "Failesd to Update the Account Password";
		}
	}
	
}
