package com.junitUserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
		public boolean firstName(String firstName) {
			boolean fname = Pattern.matches("^[A-Z]([a-z]{2,})$", firstName);
			return fname;
	}

}
