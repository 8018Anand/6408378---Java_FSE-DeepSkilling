package com.Mockito_Ex_1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*; 


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TestExternalAPI {	
	@Test
	void test() {
		ExternalApi mockApi = Mockito.mock(ExternalApi.class);
		when(mockApi.getData()).thenReturn("Fetched Data");
		String result = mockApi.getData();
		ExternalApi api = new ExternalApi();
		String actRes = api.getData();
		assertEquals(result, actRes, "Your mockApi is not working properly");
	}

}
