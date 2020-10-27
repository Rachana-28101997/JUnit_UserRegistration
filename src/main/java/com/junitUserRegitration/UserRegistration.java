package com.junitUserRegitration;
import java.util.regex.*;

public class UserRegistration {
	public static boolean firstName(String firstName) {
		boolean fname = Pattern.matches("^[A-Z]([a-z]{2,})$", firstName);
		return fname;
}
	public boolean lastName(String lastName) {
		boolean lname = Pattern.matches("^[A-Z]([a-z]{2,})$", lastName);
		return lname;
}
}