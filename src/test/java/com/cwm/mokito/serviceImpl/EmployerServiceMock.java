package com.cwm.mokito.serviceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.cwm.mokito.service.EmployeeService;

public class EmployerServiceMock {

	
	EmployeeService employeeService= mock(EmployeeService.class);
	
	@Test
	public void testEmployeeServiceImple() {
		List<String> employees= Arrays.asList("Shyam","Akash","Bhushan","Laxman","Vaibhav");
		when(employeeService.employeeList()).thenReturn(employees);
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl(employeeService);
		List<String> empList=employeeServiceImpl.employeeList();
 		assertEquals(5, empList.size());
	
	}
}
