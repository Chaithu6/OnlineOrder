package com.onlineorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineorder.entities.OrderDetails;

public interface OrderDetailsDAO  extends JpaRepository<OrderDetails, Integer>{


}
