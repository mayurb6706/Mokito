package com.cwm.mokito.serviceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListMock2 {


	@Test
	public void test1() {
		List list= mock(List.class);
		when(list.size()).thenReturn(3);
		
		assertEquals(3, list.size());
	}
	
	
	@Test
	public void test2() {
		List list= mock(List.class);
		
		when(list.get(0)).thenReturn("Laxman");
		
		assertEquals("Laxman", list.get(0));
	}
	
	@Test
	public  void test3() {
		List list = mock(List.class);
		
		when(list.get(anyInt())).thenReturn("Mayur");
		assertEquals("Mayur", list.get(4));
		assertEquals("Mayur", list.get(50));
	}
	
	@Test(expected = RuntimeException.class)
	public void test4() {
		List list = mock(List.class);
		when(list.get(anyInt())).thenThrow(new RuntimeException());
	}
}
