package com.onlineorder.exceptions;

public class WrongPaymentIdException extends Exception{
	public WrongPaymentIdException(String message) {
		super(message);
		}

		public WrongPaymentIdException() {}
}
