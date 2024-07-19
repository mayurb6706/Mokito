package com.cwm.mokito.serviceImpl;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.cwm.mokito.service.EmployeeService;

public class EmployeeServiceBdd {

	EmployeeService employeeService= mock(EmployeeService.class);
	@Test
	public void employeeListTest() {
		
		//Given
		List<String> employees= Arrays.asList("Shyam","Akash","Bhushan","Laxman","Vaibhav");
		
		EmployeeServiceImpl employeeServiceImpl= new EmployeeServiceImpl(employeeService);
	given(employeeService.employeeList()).willReturn(employees);
	
	List<String> list= employeeServiceImpl.employeeList();
	
  assertThat(list.size(),is(5));
	}
}
