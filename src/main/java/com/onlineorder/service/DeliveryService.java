package com.onlineorder.service;

import java.util.List;

import com.onlineorder.entities.Delivery;
import com.onlineorder.exceptions.DeliveryAlreadyExistsException;
import com.onlineorder.exceptions.DeliveryNotFoundException;


public interface DeliveryService {
	public List<Delivery> getAllDeliveries();
	public Delivery getDeliveryById(Integer deliveryId) throws DeliveryNotFoundException;
	public Delivery addDelivery(Delivery delivery) throws DeliveryAlreadyExistsException;
	public Delivery updateDelivery(Delivery delivery);
	public void deleteDeliveryById(Integer deliveryId);
}
