package com.onlineorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineorder.dao.DeliveryDAO;
import com.onlineorder.entities.Delivery;
import com.onlineorder.entities.Delivery;
import com.onlineorder.exceptions.DeliveryAlreadyExistsException;
import com.onlineorder.exceptions.DeliveryNotFoundException;
import com.onlineorder.exceptions.DeliveryAlreadyExistsException;
import com.onlineorder.exceptions.DeliveryNotFoundException;


@Service
public class DeliveryServiceImpl implements DeliveryService{
		@Autowired
		private DeliveryDAO deliveryDao;

		@Override
		public List<Delivery> getAllDeliveries() {
			return deliveryDao.findAll();

		}

		@Override
		public Delivery getDeliveryById(Integer deliveryId) throws DeliveryNotFoundException{
		Delivery c;
			if(deliveryDao.findById(deliveryId).isEmpty()) {
				throw new DeliveryNotFoundException();
			}
			else {
				c=deliveryDao.findById(deliveryId).get();
			}
			return c;
		}


		@Override
		public Delivery addDelivery(Delivery Delivery) throws DeliveryAlreadyExistsException {
			 if(deliveryDao.findById(Delivery.getDeliveryId()).isEmpty()) {
		            deliveryDao.save(Delivery);
		            return Delivery;
		        }
		        else {
		            throw new DeliveryAlreadyExistsException();
		        }	
		}
		
		@Override
		public Delivery updateDelivery(Delivery Delivery) {
			deliveryDao.save(Delivery);
			return Delivery;
			
		}

		@Override
		public void deleteDeliveryById(Integer deliveryId) {
			Delivery t =deliveryDao.getById(deliveryId);
			deliveryDao.delete(t);
			
		}

}
