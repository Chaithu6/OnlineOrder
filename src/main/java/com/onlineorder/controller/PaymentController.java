package com.onlineorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineorder.entities.Payment;
import com.onlineorder.exceptions.WrongPaymentIdException;
import com.onlineorder.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/payments")
	public List<Payment> getAllPayments() {
		return this.paymentService.getAllPayments();
	}
	@GetMapping("/payment/{paymentId}")
	public ResponseEntity getPaymentById(@PathVariable("paymentId") Integer paymentId) throws WrongPaymentIdException {
		return new ResponseEntity (paymentService.getPaymentById(paymentId), HttpStatus.OK);
	}
	
	@PostMapping("/payment")
	public Payment addProduct(@RequestBody Payment payment) {
		
			return this.paymentService.addPayment(payment);
	}
	
	@PutMapping("/payment")
	public Payment updatePayment(@RequestBody Payment payment) {
		return this.paymentService.updatePayment(payment);
	
	}
@DeleteMapping("/payment/{id}")
public void deletePaymentById(@PathVariable("id") Integer paymentId) {
	this.paymentService.deletePaymentById(paymentId);
}

}
