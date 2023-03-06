package com.onlineorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineorder.entities.Delivery;

public interface DeliveryDAO extends JpaRepository<Delivery, Integer>{

}
