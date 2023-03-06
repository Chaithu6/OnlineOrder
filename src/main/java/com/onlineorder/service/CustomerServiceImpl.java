package com.onlineorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineorder.dao.CustomerDAO;
import com.onlineorder.entities.Customer;
import com.onlineorder.exceptions.CustomerAlreadyExistsException;
import com.onlineorder.exceptions.CustomerNotFoundException;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO customerDao;

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.findAll();

	}

@Override
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException{
		Customer c;
		if(customerDao.findById(customerId).isEmpty()) {
			throw new CustomerNotFoundException();
		}
		else {
			c=customerDao.findById(customerId).get();
		}
		return c;
	}


	@Override
	public Customer addCustomer(Customer customer) throws CustomerAlreadyExistsException{
		 if(customerDao.findById(customer.getCustomerId()).isEmpty()) {
	            customerDao.save(customer);
	            return customer;
	        }
	        else {
	            throw new CustomerAlreadyExistsException();
	        }	
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		customerDao.save(customer);
		return customer;
		
	}

	@Override
	public void deleteCustomerById(Integer customerId) {
		Customer c =customerDao.getById(customerId);
		customerDao.delete(c);
		
	}

	}

