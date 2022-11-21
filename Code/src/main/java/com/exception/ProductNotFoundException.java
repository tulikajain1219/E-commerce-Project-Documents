package com.exception;

public class ProductNotFoundException extends Exception{

	public ProductNotFoundException() {
		
	}
	public String toString() {
		return "Product Not Found";
	}
}
