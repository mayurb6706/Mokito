package com.cwm.mokito.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.cwm.mokito.entity.Student;
import com.cwm.mokito.service.StudentService;

public class StudentServiceImpl {
	
	StudentService studentService;

	public StudentServiceImpl(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	
	public List<Student> studentList(){
		
		//Return student on the same school
		
		List<Student> list=this.studentService.studentList();
		
		List<Student> stuents=  new ArrayList<Student>();
		
		for(Student s: list) {
			if(s.getSchool().equalsIgnoreCase("abc")) {
				stuents.add(s);
			}
		}
		
		return stuents;
	}

}
