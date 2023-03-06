package com.onlineorder.service;

import java.util.List;

import com.onlineorder.entities.OrderDetails;
import com.onlineorder.exceptions.OrderDetailsAlreadyExistsException;
import com.onlineorder.exceptions.OrderDetailsNotFoundException;


public interface OrderDetailsService {
	public List<OrderDetails> getAllOrderDetails();
	public OrderDetails getOrderDetailsById(Integer orderId)throws OrderDetailsNotFoundException;
	public OrderDetails addOrderDetails(OrderDetails orderdetails) throws OrderDetailsAlreadyExistsException;
	public OrderDetails updateOrderDetails(OrderDetails orderdetails);
	public void deleteOrderDetailsById(Integer orderId);
}
