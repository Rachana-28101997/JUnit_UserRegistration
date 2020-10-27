package com.junitUserRegistration;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class LastNameTest {
	static UserRegistration user;

	@BeforeClass
	public static void createUserRegistrationObj() {
		user = new UserRegistration();
		System.out.println("In before class: Last Name");
	}

	@AfterClass
	public static void nullObj() {
		System.out.println("In After class: Last Name");
		user = null;
	}

	@Test
	public void testLasttNameWithFirstLetterCapital_testAssertionHappy() {
		boolean result = user.lastName("Rachu");
		Assert.assertTrue(result);
	}

	@Test
	public void testLastNameWithSpecialChracter_testAssertionSad() {
		boolean result = user.lastName("Ra@chu");
		Assert.assertFalse(result);
	}

	@Test
	public void testLastNameWithoutFirstLetterCapital_testAssertionSad() {
		boolean result = user.lastName("rachu");
		Assert.assertFalse(result);
	}

	@Test
	public void testLastNameWithLessThanThreeCharacter_testAssertionSad() {
		boolean result = user.lastName("Ra");
		Assert.assertFalse(result);
	}
}

