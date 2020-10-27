package com.junitUserRegistration;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class FirstNameTest {
	static UserRegistration user;
	@BeforeClass
	public static void createUserRegistrationObj(){
		user = new UserRegistration();
		System.out.println("In before class: First Name");
	}
	
	@AfterClass
	public static void nullObj(){
		System.out.println("In After class: First Name");
		user = null;
	}
	
	@Test
	public  void testFirstNameWithFirstLetterCapital_testAssertionHappy() {
		boolean result = user.firstName("Rachana");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFirstNameWithSpecialCharater_testAssertionSad() {
		boolean result = user.firstName("Rach@na");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testFirstNameWithoutFirstLetterCapital_testAssertionSad() {
		boolean result = user.firstName("rachana");
		Assert.assertTrue(result);
	}
	
	
	@Test
	public void testFirstNameWithLessThanThreeCharacter_testAssertionSad() {
		boolean result = user.firstName("Ra");
		Assert.assertFalse(result);
	}
}


