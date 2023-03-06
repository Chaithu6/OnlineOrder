package com.onlineorder.exceptions;

public class OrderDetailsAlreadyExistsException extends Exception{
	private static final long serialVersionUID = 1L;

	public OrderDetailsAlreadyExistsException(String message) {
		super(message);
	}

	public OrderDetailsAlreadyExistsException() {}{
	}
}
