package com.assignments.UserRegistrationJUnit;

public class InvalidUserDetailsException extends RuntimeException {
	enum ExceptionType {
		InvalidFirstNameException, InvalidLastNameException, InvalidEmailException, InvalidMobileNumberException,
		InvalidPasswordException
	}

	ExceptionType exceptionType;

	public InvalidUserDetailsException(String message, ExceptionType exceptionType) {
		super(message);
		this.exceptionType = exceptionType;
	}
}
