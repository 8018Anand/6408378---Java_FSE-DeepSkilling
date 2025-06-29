package com.Mockito_Ex_2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.*;
//import org.mockito.Mockito.*;

class TestGreet {
	//Arrange
	static Greet gt;
	static Greet mockGt;
	
	@BeforeAll
	static void setup() {
		gt = new Greet();
		mockGt = Mockito.mock(Greet.class);
	}
	
	
	//Act
	@Test
	void testGreetHello() {
		when(mockGt.greetHello("Anand")).thenReturn("Hello Anand");
		assertEquals(mockGt.greetHello("Anand"), gt.greetHello("Anand"), "Mocking is failed");
		verify(mockGt).greetHello("Anand");
	}
	@Test
	void testGreetHi() {
		when(mockGt.greetHi("Anand")).thenReturn("Hi Anand");
		assertEquals(mockGt.greetHi("Anand"), gt.greetHi("Anand"), "Mocking is failed");
		verify(mockGt).greetHi("Anand");
	}
	@Test
	void testGreetWelcome() {
		when(mockGt.greetWelcome("Anand")).thenReturn("Welcome Anand");
		assertEquals(mockGt.greetWelcome("Anand"), gt.greetWelcome("Anand"), "Mocking is failed");
		verify(mockGt).greetWelcome("Anand");
	}
	//Assert
	@AfterAll
	static void tearDown() {
		gt = null;
		mockGt = null;
	}
}
