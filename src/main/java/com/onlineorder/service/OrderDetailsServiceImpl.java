package com.onlineorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineorder.dao.OrderDetailsDAO;
import com.onlineorder.entities.OrderDetails;
import com.onlineorder.exceptions.OrderDetailsNotFoundException;
import com.onlineorder.exceptions.OrderDetailsAlreadyExistsException;
import com.onlineorder.exceptions.OrderDetailsNotFoundException;


@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

		
		@Autowired
		private OrderDetailsDAO orderdetailsDao;
		@Override
		public List<OrderDetails> getAllOrderDetails() {
			return orderdetailsDao.findAll();
		}

		@Override
		public OrderDetails getOrderDetailsById(Integer orderId) throws OrderDetailsNotFoundException{
			OrderDetails o;
			if(orderdetailsDao.findById(orderId).isEmpty()) {
				throw new OrderDetailsNotFoundException();
			}
			else {
				o=orderdetailsDao.findById(orderId).get();
			}
			return o;
		}

		@Override
		public OrderDetails addOrderDetails(OrderDetails orderdetails) throws OrderDetailsAlreadyExistsException {
			if(orderdetailsDao.findById(orderdetails.getOrderId()).isEmpty()) {
	            orderdetailsDao.save(orderdetails);
	            return orderdetails;
	        }
	        else {
	            throw new OrderDetailsAlreadyExistsException();
	        }
		}

		@Override
		public OrderDetails updateOrderDetails(OrderDetails orderdetails){
			orderdetailsDao.save(orderdetails);
			return orderdetails;
		
		}

		@Override
		public void deleteOrderDetailsById(Integer orderId) {
		OrderDetails o =orderdetailsDao.getById(orderId);
			orderdetailsDao.delete(o);
			
		}

}
