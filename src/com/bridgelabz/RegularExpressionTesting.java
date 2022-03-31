package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegularExpressionTesting {
	
	JUnit jUnit = new JUnit();
	
	@Test
	void testFirstName() {
		assertTrue(jUnit.firstName("Nikita"));
	}
	
	@Test
	void testLastName() {
		assertTrue(jUnit.lastName("Chougule"));
	}
	
	@Test
	void testEmailID() {
		assertTrue(jUnit.emailId("abc.nikita@bl.co"));
	}
	
	@Test
	void testMobileNumber() {
		assertTrue(jUnit.mobileNumber("91 9874586984"));
	}
	
	@Test
	void testPassword() {
		assertTrue(jUnit.password("Nikita@21"));
	}

	
	

}
