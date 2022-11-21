package com.exception;

public class AdminNotLoggedException extends Exception{

	public AdminNotLoggedException() {
		
	}
	public String toString() {
		return "Admin not logged in";
	}
}