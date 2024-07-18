package com.cwm.mokito.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.cwm.mokito.service.BussinessService;

public class BussinessServiceImpl {

	private BussinessService service;

	public BussinessServiceImpl(BussinessService service) {
		super();
		this.service = service;
	}
	
	public List<String> returnTODOByUser(String user){
		List<String> filterTods=new ArrayList<String>();
		
		List<String> todos= this.service.returnToDOList(user);
		for(String todo:todos) {
			if(todo.contains("Spring")) {
				filterTods.add(todo);
			}
		}
		return filterTods;
	}
	
	
	
}
