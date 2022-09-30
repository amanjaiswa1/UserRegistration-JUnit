package com.assignments.UserRegistrationJUnit;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
	@Test
	public void givenProperFirstNameShouldReturnTrue() {
		boolean result = UserRegistration.validateFirstName("Aman");
		Assert.assertTrue(result);
	}

	@Test
	public void givenImproperFirstNameShouldReturnInvalidMessage() {
		try {
			new UserRegistration();
			UserRegistration.validateFirstName("aman");
		} catch (InvalidUserDetailsException e) {
			assertEquals(InvalidUserDetailsException.ExceptionType.InvalidFirstNameException, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenProperLastNameShouldReturnTure() {
		boolean result = UserRegistration.validateLastName("Khan");
		Assert.assertTrue(result);
	}

	@Test
	public void givenImproperLastNameShouldReturnInvalidMessage() {
		try {
			new UserRegistration();
			UserRegistration.validateLastName("khan");
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals(InvalidUserDetailsException.ExceptionType.InvalidLastNameException, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenProperEmailShouldReturnTure() {
		boolean result = UserRegistration.validateEmail("aman-khan@gmail.co1.in");
		Assert.assertTrue(result);
	}

	@Test
	public void givenImproperEmailShouldReturnInvalidMessage() {
		try {
			new UserRegistration();
			UserRegistration.validateEmail("aman-Khan@gmail.co.in1");
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals(InvalidUserDetailsException.ExceptionType.InvalidEmailException, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenProperPhoneNumberShouldReturnTure() {
		boolean result = UserRegistration.validatePhoneNumber("91 1234567890");
		Assert.assertTrue(result);
	}

	@Test
	public void givenImproperPhoneNumberShouldReturnInvalidMessage() {
		try {
			new UserRegistration();
			UserRegistration.validatePhoneNumber("919087654321");
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals(InvalidUserDetailsException.ExceptionType.InvalidMobileNumberException,
					e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenProperPasswordShouldReturnTure() {
		boolean result = UserRegistration.validatePassword("khanAman@1");
		Assert.assertTrue(result);
	}

	@Test
	public void givenImproperPasswordShouldReturnInvalidMessage() {
		try {
			new UserRegistration();
			UserRegistration.validatePassword("Aman@1");
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals(InvalidUserDetailsException.ExceptionType.InvalidPasswordException, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenDetails_WhenProper_ShouldReturnHAPPY() {
		UserRegistration validator = new UserRegistration();
		String result = validator.userRegistrationValidation("Aman", "Khan", "aman-khan@gmail.co1.in", "91 1234567890",
				"khanAman@1");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void givenDetails_WhenImproper_ShouldReturnSAD() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.userRegistrationValidation("aman", "khan", "aman-Khan@gmail.co.in1", "919087654321", "Aman@1");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Details");
		}
	}
}
