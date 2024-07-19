package com.cwm.mokito.serviceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cwm.mokito.entity.Student;
import com.cwm.mokito.service.StudentService;

public class StudentServiceMock {

	//Mock the Student Service
	//So we need to implement the method inside the service class
	StudentService studentService= mock(StudentService.class);
	
	
	@Test
	public void testStudentList() {
		
		StudentServiceImpl studentServiceImpl= new StudentServiceImpl(studentService);
		
		//Created a list of students 
		List<Student> list= new ArrayList<Student>();
		list.add(new Student(1,"A","abc"));
		list.add(new Student(2,"B","pqr"));
		list.add(new Student(3,"C","abc"));
		list.add(new Student(4,"D","pqr"));
		list.add(new Student(5,"E","abc"));
		
		when(studentService.studentList()).thenReturn(list);
		
	List<Student> students= studentServiceImpl.studentList();
		
		assertEquals(3, students.size());
	}
	
	
}
