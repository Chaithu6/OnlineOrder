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

import com.onlineorder.entities.OrderDetails;
import com.onlineorder.entities.OrderDetails;
import com.onlineorder.exceptions.OrderDetailsAlreadyExistsException;
import com.onlineorder.exceptions.OrderDetailsNotFoundException;
import com.onlineorder.service.OrderDetailsService;


@RestController
public class OrderDetailsController {
@Autowired
private OrderDetailsService orderdetailsService;


@GetMapping("/orderdetails")
public List<OrderDetails> getAllOrderDetails() {
	return this.orderdetailsService.getAllOrderDetails();
}
@GetMapping("/orderdetails/{orderId}")
public ResponseEntity<OrderDetails> getOrderDetailsById(@PathVariable Integer orderId) throws OrderDetailsNotFoundException{
	return new ResponseEntity<OrderDetails> (orderdetailsService.getOrderDetailsById(orderId), HttpStatus.OK);
}


@PostMapping("/orderdetails")
public OrderDetails addOrderDetails(@RequestBody OrderDetails orderdetails) throws OrderDetailsAlreadyExistsException{
	
		return this.orderdetailsService.addOrderDetails(orderdetails);
}

@PutMapping("/orderdetails") 
public OrderDetails updateOrderDetails(@RequestBody OrderDetails orderdetails) {
	return this.orderdetailsService.updateOrderDetails(orderdetails);

}
@DeleteMapping("/orderdetails/{orderId}")
public void deleteOrderDetailsById(@PathVariable Integer orderId) {
this.orderdetailsService.deleteOrderDetailsById(orderId);
}

}
