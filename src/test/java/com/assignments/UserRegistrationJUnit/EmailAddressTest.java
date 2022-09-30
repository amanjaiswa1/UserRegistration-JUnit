package com.assignments.UserRegistrationJUnit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmailAddressTest {
	private String email;
	private boolean expectedResult;

	// Each parameter should be placed as an argument here
	// Every time runner triggers, it will pass the arguments
	// from parameters we defined in primeNumbers() method
	public EmailAddressTest(String email, boolean expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection emails() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true },

				{ "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false }, { "abc123@.com", false },
				{ "abc123@.com.com", false }, { ".abc@abc.com", false }, { "abc()*@gmail.com", false },
				{ "abc@%*.com", false }, { "abc..2002@gmail.com", false }, { "abc.@gmail.com", false },
				{ "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false }, { "abc@gmail.com.aa.au", false } });
	}

	// This test will run 21 times since we have 22 parameters defined
	@Test
	public void givenEmailReturnParameterizedResult() {
		boolean result = UserRegistration.validateEmail(email);
		assertEquals(expectedResult, result);
	}
}