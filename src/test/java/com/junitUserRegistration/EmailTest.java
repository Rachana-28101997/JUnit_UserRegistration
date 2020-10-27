package com.junitUserRegistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmailTest {
	static UserRegistration user;

	@BeforeClass
	public static void createUserRegistrationObj() {
		user = new UserRegistration();
		System.out.println("In before class: Email");
	}

	@AfterClass
	public static void nullObj() {
		System.out.println("In After class: Email");
		user = null;
	}

	@Test
	public void testEmailWithThreeMandatoryFeilds_testAssertionHappy() {
		boolean result = user.email("rachana@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void testEmailWithoutThreeMandatoryFeilds_testAssertionSad() {
		boolean result = user.email("rach@com");
		Assert.assertFalse(result);
	}

}
