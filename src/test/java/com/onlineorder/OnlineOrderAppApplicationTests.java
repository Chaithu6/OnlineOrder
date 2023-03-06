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
class OnlineOrderAppApplicationTests {

	@Test
	void contextLoads() {
	}
}
