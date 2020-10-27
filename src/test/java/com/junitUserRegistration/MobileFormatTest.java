package com.junitUserRegistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobileFormatTest {

	static UserRegistration user;

	@BeforeClass
	public static void createUserRegistrationObj() {
		user = new UserRegistration();
		System.out.println("In before class: Mobile Number");
	}

	@AfterClass
	public static void nullObj() {
		System.out.println("In After class: Mobile Number");
		user = null;
	}

	@Test
	public void testMobileNumberWithTwoMandatoryFeilds_testAssertionHappy() {
		boolean result = user.mobileNum("+91 8888999777");
		Assert.assertTrue(result);
	}

	@Test
	public void testMobileNumberWithoutTwoMandatoryFeilds_testAssertionSad() {
		boolean result = user.mobileNum("9876543210");
		Assert.assertFalse(result);
	}

}
