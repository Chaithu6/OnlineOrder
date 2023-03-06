package com.onlineorder.service;

import java.util.List;

import com.onlineorder.entities.Admin;

public interface AdminService {
	public List<Admin> getAllAdmin();
	public Admin addAdmin(Admin admin);
}
