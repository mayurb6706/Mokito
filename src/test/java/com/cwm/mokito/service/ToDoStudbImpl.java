package com.cwm.mokito.service;

import java.util.Arrays;
import java.util.List;

import com.cwm.mokito.service.BussinessService;

public class ToDoStudbImpl implements BussinessService {

	@Override
	public List<String> returnToDOList(String user) {
		
		return Arrays.asList("Learn Spring core",
				"Learn Spring Context", "Learn Java");
	}

}