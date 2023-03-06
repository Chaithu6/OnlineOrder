package com.onlineorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineorder.dao.AdminDAO;
import com.onlineorder.entities.Admin;


@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDAO adminDao;
	@Override
	public List<Admin> getAllAdmin() {
		return adminDao.findAll();
	}
		

	@Override
	public Admin addAdmin(Admin admin) {
		adminDao.save(admin);
		return admin;

}
	}
