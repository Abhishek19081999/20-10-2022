package com.exception.bll;

public class NullException extends Exception{//creating a custom exception
	public NullException() {
		super();
	}
	
	public NullException(String message) {
		super(message);
	}
}
