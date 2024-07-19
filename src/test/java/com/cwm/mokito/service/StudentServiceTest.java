package com.cwm.mokito.service;

import java.util.ArrayList;
import java.util.List;

import com.cwm.mokito.entity.Student;

public class StudentServiceTest  implements StudentService{


	@Override
	public List<Student> studentList() {
		
		List<Student> list= new ArrayList<Student>();
		list.add(new Student(1,"A","abc"));
		list.add(new Student(2,"B","pqr"));
		list.add(new Student(3,"C","abc"));
		list.add(new Student(4,"D","pqr"));
		list.add(new Student(5,"E","abc"));
		
		return list;
	}

}
