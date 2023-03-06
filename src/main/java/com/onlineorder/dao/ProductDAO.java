package com.onlineorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineorder.entities.Product;

public interface ProductDAO  extends JpaRepository<Product, Integer>{


}
