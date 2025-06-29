package com.Caliculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;


class CalciTest {
	static Calci ca;
	@BeforeAll
	//Arrange
	static void setup() {
		ca = new Calci();
	}
	//Act
	@Test
	void addTest() {
		assertEquals(10, ca.add(6, 4), "Function failed");
	}
	@Test
	void subTest() {
		assertEquals(7, ca.sub(10, 3), "Function failed");
	}
	@Test
	void mulTest() {
		assertEquals(27, ca.mul(9, 3), "Function failed");
	}
	@Test
	void divTest() {
		assertEquals(5, ca.div(10, 2), "Function failed");
	}
	@Test
	void modTest() {
		assertEquals(0, ca.mod(10, 5), "Function failed");
	}
	//assert
}
