package com.onlineorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineorder.entities.Customer;



public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
