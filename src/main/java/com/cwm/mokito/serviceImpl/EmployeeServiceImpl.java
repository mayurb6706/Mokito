package com.cwm.mokito.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cwm.mokito.service.EmployeeService;

public class EmployeeServiceImpl {

	EmployeeService employeeService;

	public EmployeeServiceImpl(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	public List<String> employeeList(){
		return Arrays.asList("Shyam","Akash","Bhushan","Laxman","Vaibhav");
	}
}
