package com.cwm.mokito.serviceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.cwm.mokito.service.BussinessService;
import com.cwm.mokito.service.ToDoStudbImpl;

public class TestMock {

//	ToDoStudbImpl service= new ToDoStudbImpl();
//	
//	BussinessServiceImpl serviceImpl = new BussinessServiceImpl(service);
	@Test
	public void testBussinessServiceImpleByMock() {
		
	
		BussinessService bussinessServiceMock= mock(BussinessService.class);
		
		List<String> todos= Arrays.asList("Learn Spring core",
				"Learn Spring Context", "Learn Java");
		
		when(bussinessServiceMock.returnToDOList("Dummy")).thenReturn(todos);
		
		
		BussinessServiceImpl bussinessServiceImpl= new BussinessServiceImpl(bussinessServiceMock);
		
		List<String> returnTodos= bussinessServiceImpl.returnTODOByUser("Dummy");
		assertEquals(2, returnTodos.size());
	
		
	}

	@Test
	public void testBussinessServiceImpleByMock_withEmptyList() {
		
	
		BussinessService bussinessServiceMock= mock(BussinessService.class);
		
		List<String> todos= Arrays.asList();
		
		when(bussinessServiceMock.returnToDOList("Dummy")).thenReturn(todos);
		
		
		BussinessServiceImpl bussinessServiceImpl= new BussinessServiceImpl(bussinessServiceMock);
		
		List<String> returnTodos= bussinessServiceImpl.returnTODOByUser("Dummy");
		assertEquals(0, returnTodos.size());
	
		
	}
}
