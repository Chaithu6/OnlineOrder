package com.onlineorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineorder.entities.Admin;


public interface AdminDAO  extends JpaRepository<Admin, Integer>{


}
