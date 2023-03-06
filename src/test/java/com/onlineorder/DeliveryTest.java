package com.onlineorder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import java.util.Optional;
import com.onlineorder.dao.DeliveryDAO;
import com.onlineorder.entities.Delivery;


public class DeliveryTest {

	@Autowired
	private DeliveryDAO deliveryDAO;
	@Test
	public void addDelivery() throws Exception {
	 new Delivery(1, 781265421, "bangalore", "Delivered");
//	Assertions.assertThat(deliveryDAO.findById(1).get());
}
	@Test
 public void getDelivery(){
Delivery delivery = deliveryDAO.findById(2).get();
	 Assertions.assertThat(delivery.getDeliveryId()).isEqualTo(2);;
	}

}
