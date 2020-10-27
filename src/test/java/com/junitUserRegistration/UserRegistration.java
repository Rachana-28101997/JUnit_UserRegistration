package com.junitUserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
		public boolean firstName(String firstName) {
			boolean fname = Pattern.matches("^[A-Z]([a-z]{2,})$", firstName);
			return fname;
	}
		public boolean lastName(String lastName) {
			boolean lname = Pattern.matches("^[A-Z]([a-z]{2,})$", lastName);
			return lname;
	}

}
