package com.exception;

public class AdminNotFoundException extends Exception{

	public AdminNotFoundException() {
		
	}
	public String toString() {
		return "Admin Not Found";
	}
}