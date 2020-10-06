package com.SchoolMarkListManagementSystem.WebProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolMarkListManagementSystem.WebProject.Domains.Course;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Staff;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Student;
import com.SchoolMarkListManagementSystem.WebProject.Domains.Subjects;
import com.SchoolMarkListManagementSystem.WebProject.Repository.CourseRepository;
import com.SchoolMarkListManagementSystem.WebProject.Repository.StaffRepository;
import com.SchoolMarkListManagementSystem.WebProject.Repository.StudentRepository;
import com.SchoolMarkListManagementSystem.WebProject.Repository.SubjectRepository;

@Service
public class UpdateService {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	StaffRepository staffRepository;
	
	@Autowired
	SubjectRepository subRepo;
	
	@Autowired
	CourseRepository courseRepo;
//	String value;
	
	public String updateStudent(Student student) {
			if(studentRepository.updateStudentAddress(student.getAddress() , student.getStdId()) > 0){
				return "success";
			}else {
				return "fail";
			}
	}
	
	public String updateStudentMobile(Student student) {
		if(studentRepository.updateStudentMobile(student.getMobileNum(), student.getStdId()) > 0) {
			return "Updated Mobile Number Successfully";
		}else {
			return "Re-try";
		}
	}
	
	public String updateStudentMail(Student student) {
		if(studentRepository.updateStudentMail(student.getMailId(), student.getStdId()) > 0) {
			return "Mail Id update Successfully";
		}else {
			return "Re-try";
		}
	}
	
	public String updateStudentLang(Student student) {
		if(studentRepository.updateStudentLang(student.getLanguage(), student.getStdId()) > 0) {
			return "Updated to "+student.getLanguage()+" Successfully";
		}else {
			return "failed to update the Language";
		}
	}
	
	public String updateStaffAdd(Staff staff) {
		if(staffRepository.updateStaffAddress(staff.getAddress(), staff.getStfId()) > 0) {
			return "Successfully updated the address";
		}else {
			return "Retry with Correct Value";
		}
	}
	
	public String updateStaffMobile(Staff staff) {
		if(staffRepository.updateStaffMobile(staff.getMobileNum(), staff.getStfId()) > 0) {
			return "Changed the Mobile Num to"+staff.getMobileNum() +" Successfully"; 
		}else {
			return "Failed to change the Mobile Number";
		}
	}
	
	public String updateStaffMail(Staff staff) {
		if(staffRepository.updateStaffMail(staff.getMailId(), staff.getStfId()) > 0) {
			return "Your MailId is Updated to "+staff.getMailId() + " Successfully";
		}else {
			return "Failed to Update the MailId";
		}
	}
	
	public String updateSubName(Subjects subject) {
		if(subRepo.updateSubjectName(subject.getSubName(), subject.getSubId()) > 0) {
			return "Subject Name Was Successfully updated";
		}else {
			return "Re-try Again !";
		}
	}
	
	public String updateSubDesc(Subjects subject) {
		if(subRepo.updateSubjectDescription(subject.getDescription(), subject.getSubId()) > 0) {
			return "Successfully updated the Subject Description";
		}else {
			return "Re-try Again !";
		}
	}
	
	public String updateSubCourse(Subjects subject) {
		if(subRepo.updateSubCourse(subject.getCouId(), subject.getSubId()) > 0) {
			return "Successfully updated the Course";
		}else {
			return "Re-try Again !";
		}
	}
	
	public String updateCourseCategory(Course course) {
		if(courseRepo.updateCourseCategory(course.getCategory(), course.getCouId()) > 0) {
			return "Successfully updated the course category";
		}else {
			return "Check the CourseId and Category";
		}
	}
}
