package com.onlineorder.service;

import java.util.List;

import com.onlineorder.entities.Customer;
import com.onlineorder.exceptions.CustomerAlreadyExistsException;
import com.onlineorder.exceptions.CustomerNotFoundException;

public interface CustomerService {
	public List<Customer> getAllCustomers();
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException;
	public Customer addCustomer(Customer customer) throws CustomerAlreadyExistsException;
	public Customer updateCustomer(Customer customer);
	public void deleteCustomerById(Integer customerId);
}
