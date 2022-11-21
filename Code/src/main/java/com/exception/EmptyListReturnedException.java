package com.exception;

public class EmptyListReturnedException extends Exception{

	public EmptyListReturnedException() {
		
	}
	public String toString() {
		return "List is empty";
	}
}