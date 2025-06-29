package com.Excercise_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserAuthTest {

	@Test
	void verifyTest() {
		boolean isVerified = false;
//		assertTrue(isVerified);
		assertFalse(isVerified);
	}
	@Test
	void userTest() {
		Object user = null;
		assertNull(user);
//		assertNotNull(user);
	}

}
