package com.cwm.mokito.serviceImpl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.cwm.mokito.entity.Student;
import com.cwm.mokito.service.StudentServiceTest;

public class StudentServiceImplTestStud {

	//Create an object of studentServiceTest
StudentServiceTest serviceTest= new StudentServiceTest();

//Create an Object od StudentServiceImpl
StudentServiceImpl studentServiceImpl= new StudentServiceImpl(serviceTest);
	
	@Test
	public void testStudentListSize() {
		
		List<Student> students= studentServiceImpl.studentList();
		
		assertEquals(3, students.size());
	}
	
	
}
