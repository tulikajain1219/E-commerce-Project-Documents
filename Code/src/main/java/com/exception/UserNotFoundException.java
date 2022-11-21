package com.exception;

public class UserNotFoundException extends Exception{

	public UserNotFoundException() {
		
	}
	public String toString() {
		return "User Not Found";
	}
}
