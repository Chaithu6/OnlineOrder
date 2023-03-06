package com.onlineorder.exceptions;

public class OrderDetailsNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public OrderDetailsNotFoundException(String message) {
		super(message);
	}

	public OrderDetailsNotFoundException() {}


}
