package com.SchoolMarkListManagementSystem.WebProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Student;
import com.SchoolMarkListManagementSystem.WebProject.Repository.StudentRepository;

@Service
public class UpdateService {

	@Autowired
	StudentRepository studentRepository;
	
	String value;
	
	public String updateStudent(Student student,String value) {
		this.value = value;
		if(value.equalsIgnoreCase("Address")) {
			if(studentRepository.updateStudentAddress(student.getAddress() , student.getStdId()) > 0){
				return "success";
			}else {
				return "fail";
			}
		}else if(value.equalsIgnoreCase("MobileNum")){
			if(studentRepository.updateStudentMobile(student.getMobileNum(), student.getStdId()) > 0) {
				return "Update Mobile Number Successfully";
			}else {
				return "Re-try";
			}
		}else {
			return "ipothaiku";
		}
	}
	
	
}
