package com.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetTest {

	@Test
	void test() {
		Greet gt = new Greet();
		assertEquals("Hello friends", gt.greet(), "There is some error in code");
	}

}
