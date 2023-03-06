package com.onlineorder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onlineorder.dao.AdminDAO;
import com.onlineorder.entities.Admin;

@SpringBootTest
public class AdminTest {

	@Autowired
	private AdminDAO adminDao;
	@Test
	public void addAdmin() throws Exception {
	 new Admin(1, "admin21@gmail.com", "admin");
	Assertions.assertThat(adminDao.findById(1).get());
}
	@Test
 public void getAdmin(){
Admin admin = adminDao.findById(1).get();
	 Assertions.assertThat(admin.getAdminId()).isEqualTo(1);
	}
}
	

