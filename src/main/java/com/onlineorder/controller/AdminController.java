package com.onlineorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineorder.entities.Admin;
import com.onlineorder.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService adminservice;
	
	@GetMapping("/login")
	public List<Admin> getAllAdmin() {
		return this.adminservice.getAllAdmin();
	}
	@PostMapping("/register")
	public Admin addAdmin(@RequestBody Admin admin) {
			return this.adminservice.addAdmin(admin);
	}
	
}
