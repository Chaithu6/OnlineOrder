package com.onlineorder;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.onlineorder.dao.CustomerDAO;
import com.onlineorder.entities.Customer;

@SpringBootTest
public class CustomerTest {
	@Autowired
	private CustomerDAO customerDAO;
	@Test
	public void addCustomer() throws Exception {
	 new Customer(1, "chetana", "chetana123@gmail.com", 789765421, "Bangalore");
	Assertions.assertThat(customerDAO.findById(1).get());
}
	@Test
 public void getCustomer(){
Customer Customer = customerDAO.findById(1).get();
	 Assertions.assertThat(Customer.getCustomerId()).isEqualTo(1);;
	}
	@Test
	@Rollback(value = false)
 public void updateCustomer(){
	 Customer customer = customerDAO.findById(1).get();
	 customer.setCustomerName("chetana");
 Customer CustomerUpdated =customerDAO.save(customer);
	 Assertions.assertThat(CustomerUpdated.getCustomerName()).isEqualTo("chetana");
	 }
	

}
