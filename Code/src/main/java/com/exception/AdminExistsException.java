package com.exception;

public class AdminExistsException extends Exception{

	public AdminExistsException() {
		
	}
	public String toString() {
		return "Admin Already Exists";
	}
}