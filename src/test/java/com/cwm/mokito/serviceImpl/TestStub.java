package com.cwm.mokito.serviceImpl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.cwm.mokito.service.ToDoStudbImpl;
import com.cwm.mokito.serviceImpl.BussinessServiceImpl;

public class TestStub {

	ToDoStudbImpl service= new ToDoStudbImpl();
	
	BussinessServiceImpl serviceImpl = new BussinessServiceImpl(service);
	@Test
	public void testBussinessServiceImpleByStud() {
		
		
		
		List<String> todos= this.serviceImpl.returnTODOByUser("Dummy");
		
		assertEquals(2, todos.size());
	
		
	}

}
