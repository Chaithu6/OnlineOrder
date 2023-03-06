package com.onlineorder.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

import com.onlineorder.entities.Customer;
import com.onlineorder.exceptions.CustomerAlreadyExistsException;
import com.onlineorder.exceptions.CustomerNotFoundException;
import com.onlineorder.service.CustomerService;



@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return this.customerService.getAllCustomers();
	}
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") Integer customerId) throws CustomerNotFoundException {
		return new ResponseEntity<Customer> (customerService.getCustomerById(customerId), HttpStatus.OK);
	}
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) throws CustomerAlreadyExistsException{
		
			return this.customerService.addCustomer(customer);
			
	}
	
	@PutMapping("/customer") 
	public Customer updateCustomer(@RequestBody Customer customer) {
		return this.customerService.updateCustomer(customer);
	
	}
@DeleteMapping("/customer/{customerId}")
public void deleteCustomerById(@PathVariable Integer customerId) {
	this.customerService.deleteCustomerById(customerId);
}

}


