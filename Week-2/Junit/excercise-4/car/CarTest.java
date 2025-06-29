package com.Excercise_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

class CarTest {
	//------------------Arrange:
	static Car c;
	@BeforeAll
	public static void setup() {
		c = new Car();
	}
	//------------------Act
	@Test
	void startTest() {
		String requires = "car started";
		String found = c.start();
		assertEquals(requires, found, "There is a problem is car");
	}
	@Test
	void accelerateTest() {
		String requires = "car is moving";
		String found = c.accelerate();
		assertEquals(requires, found, "There is a problem is car");
	}
	@Test
	void hornTest() {
		String requires = "pee..peeeep";
		String found = c.horn();
		assertEquals(requires, found, "There is a problem is car");
	}
	@Test
	void brakeTest() {
		String requires = "car stopped";
		String found = c.brake();
		assertEquals(requires, found, "There is a problem is car");
	}
	//------------------Assert
	public static void tearDown() {
		c = null;
	}
}
