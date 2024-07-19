package com.cwm.mokito.serviceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import java.util.List;

import org.junit.Test;

public class ListMock {

	@Test
	public void testMokingListInterface() {
		// Mocking list interface

		List list = mock(List.class);

		when(list.size()).thenReturn(3);

		assertEquals(3, list.size());
	}

	@Test
	public void testMockingInterfaceWithMultipleValue() {
		List list = mock(List.class);

		when(list.size()).thenReturn(2).thenReturn(4);

		assertEquals(2, list.size());
		assertEquals(4, list.size());
	}

	@Test
	public void testMockingInterfaceWithIndexValue() {
		List list = mock(List.class);

		when(list.get(0)).thenReturn("Laxman");

		assertEquals("Laxman", list.get(0));
		assertEquals(null, list.get(1));
	}

	// Anyint return sme value if we get any number of index

	@Test
	public void testMockingInterfaceWithIndexValueAny() {
		List list = mock(List.class);

		when(list.get(anyInt())).thenReturn("Laxman");

		assertEquals("Laxman", list.get(0));
		assertEquals("Laxman", list.get(1));
		assertEquals("Laxman", list.get(100));
	}

	@Test(expected = RuntimeException.class)
	public void testMockingInterfaceWithException() {
		List list = mock(List.class);

		when(list.get(anyInt())).thenThrow(new RuntimeException("Something"));
		assertEquals(1, list.get(0));
	}
	
	
	@Test
	public void testListUsingBdd() {
		List list = mock(List.class);
		
		given(list.get(0)).willReturn("Laxman");
		
		assertThat(list.get(0),is("Laxman"));
	}
}
