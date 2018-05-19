package com.ncic.yufan.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ncic.yufan.bean.Page;
import com.ncic.yufan.dao.AdminDao;
import com.ncic.yufan.entity.Admin;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/com/ncic/yufan/util/applicationContext.xml")
public class AdminDaoTest {
	@Autowired
	private AdminDao adminDao;
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	@Autowired
	private Page page;
	

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	@Test
	public void testSelectAdminByNameAndPassword() {
		Admin admin = new Admin();
		admin.setAname("admin");
		admin.setApassword("admin");
		System.out.println(adminDao.selectAdminByNameAndPassword(admin.getAname(),admin.getApassword()));
		System.out.println("bean"+page.toString());
		
	}

}
