package com.onlineorder.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = WrongPaymentIdException.class)
	public ResponseEntity<String> wrongPaymentId(WrongPaymentIdException e) {
		return new ResponseEntity<>("PaymentId Not Found", HttpStatus.NOT_FOUND);
}
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<String> productNotFound(ProductNotFoundException e) {
		return new ResponseEntity<>("Product Not Found", HttpStatus.NOT_FOUND);
}
	
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<String> CustomerNotFound(CustomerNotFoundException e) {
		return new ResponseEntity<>("Customer Not Found", HttpStatus.NOT_FOUND);
}
	
	@ExceptionHandler(value = DeliveryNotFoundException.class)
	public ResponseEntity<String> DeliveryNotFound(DeliveryNotFoundException e) {
		return new ResponseEntity<>("Delivery Not Found", HttpStatus.NOT_FOUND);
	}
	
		@ExceptionHandler(value = OrderDetailsNotFoundException.class)
		public ResponseEntity<String> OrderDetailsNotFound(OrderDetailsNotFoundException e) {
			return new ResponseEntity<>("Order Details Not Found", HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler(value = CustomerAlreadyExistsException.class)
	public ResponseEntity<String> CustomerAlreadyExists( CustomerAlreadyExistsException e) {
		return new ResponseEntity<>(" Customer Already Exists", HttpStatus.NOT_FOUND);
}
	
	@ExceptionHandler(value = DeliveryAlreadyExistsException.class)
	public ResponseEntity<String> DeliveryAlreadyExists( DeliveryAlreadyExistsException e) {
		return new ResponseEntity<>(" Delivery Already Exists", HttpStatus.NOT_FOUND);
}
	
	@ExceptionHandler(value = OrderDetailsAlreadyExistsException.class)
	public ResponseEntity<String> orderDetailsAlreadyExists( OrderDetailsAlreadyExistsException e) {
		return new ResponseEntity<>(" Order Details Already Exists", HttpStatus.NOT_FOUND);
}
}

