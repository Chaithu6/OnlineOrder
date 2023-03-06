package com.onlineorder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.onlineorder.dao.OrderDetailsDAO;
import com.onlineorder.entities.OrderDetails;



public class OrderDetailsTest {

	@Autowired
	private OrderDetailsDAO orderDetailsDAO;
	@Test
	public void addOrderDetails() throws Exception {
	 new OrderDetails(212, 1);
	
}
	@Test
 public void getOrderDetails(){
OrderDetails OrderDetails = orderDetailsDAO.getById(21);
	 Assertions.assertThat(OrderDetails.getOrderId()).isEqualTo(21);
	}

}

