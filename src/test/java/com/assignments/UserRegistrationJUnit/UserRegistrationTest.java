package com.assignments.UserRegistrationJUnit;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
	@Test
	public void givenCorrectDetailsReturnHappy() {
		UserRegistration validate = new UserRegistration();
		String result = validate.userRegistrationValidation("Tekesh", "Singh", "tekesh.singh@gmail.co.in",
				"91 1234567890", "Tekesh1Singh@");
		assertEquals("Happy", result);
	}

	@Test
	public void givenIncorrectDetailsReturnSad() {
		UserRegistration validate = new UserRegistration();
		String result = validate.userRegistrationValidation("tekesh", "singh", "tekesh-Singh@gmail.co.in1",
				"919087654321", "Tekesh@");
		assertEquals("Sad", result);
	}
}
