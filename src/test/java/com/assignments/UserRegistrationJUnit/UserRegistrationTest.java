package com.assignments.UserRegistrationJUnit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenCorrectDetailsReturnHappy() {
		UserRegistration validate = new UserRegistration();
		String result = validate.userRegistrationValidation("Tekesh", "Singh", "tekesh.singh@gmail.co.in", "91 1234567890", "Tekesh1Singh@");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void givenIncorrectDetailsReturnSad() {
		UserRegistration validate = new UserRegistration();
		String result = validate.userRegistrationValidation("tekesh", "singh", "tekesh-Singh@gmail.co.in1", "919087654321", "Tekesh@");
		Assert.assertEquals("Sad", result);
	}
}
