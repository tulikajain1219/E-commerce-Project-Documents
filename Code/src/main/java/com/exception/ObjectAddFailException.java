package com.exception;

public class ObjectAddFailException extends Exception{

	public ObjectAddFailException() {
		
	}
	public String toString() {
		return "Could not add object";
	}
}