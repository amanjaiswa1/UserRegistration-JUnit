package com.assignments.UserRegistrationJUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
	static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
	static final String EMAIL_PATTERN = "^[a-z0-9]+([.+_-]?[a-z0-9]+)?@{1}[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}";
	static final String PHONE_NUMBER_PATTERN = "^[0-9]{1,2}\\s[0-9]{10}";
	static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&]{1})[A-Za-z0-9@$!%*?&]{8,}";

	// Validate first name.
	public static boolean validateFirstName(String firstName) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		Matcher matcher = pattern.matcher(firstName);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	// Validate last name.
	public static boolean validateLastName(String lastName) {
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		Matcher matcher = pattern.matcher(lastName);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	// Validate email.
	public static boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	// Validate phone number.
	public static boolean validatePhoneNumber(String phoneNumber) {
		Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
		Matcher matcher = pattern.matcher(phoneNumber);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	// Validate password.
	public static boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(password);
		boolean matchFound = matcher.find();
		return matchFound;
	}
	
	//Test case.
	public String userRegistrationValidation(String firstName, String lastName, String email, String phoneNumber, String password) {
		if (validateFirstName(firstName) && validateLastName(lastName) && validateEmail(email)  && validatePhoneNumber(phoneNumber) && validatePassword(password)) {
			return "Happy";
		} else {
			return "Sad";
		}
	}

	public static void main(String[] args) {
		// Validate first name.
		String firstName = "Tekesh";
		System.out.println(validateFirstName(firstName));

		// Validate last name.
		String lastName = "Singh";
		System.out.println(validateLastName(lastName));

		// Validate email.
		String email = "tekesh.singh@gmail.co.in";
		System.out.println(validateEmail(email));

		// Validate phone number.
		String phoneNumber = "91 1234567890";
		System.out.println(validatePhoneNumber(phoneNumber));
		
		// Validate password- exactly one special character.
		String password;
		password = "Tekesh1Singh@";
		System.out.println(validatePassword(password));

		// Validate email for all valid and invalid samples.
		email = "abc+100@gmail.com"; // given valid sample
		System.out.println(validateEmail(email));
		email = "abc@abc@gmail.com"; // given invalid sample
		System.out.println(validateEmail(email));
	}
}
