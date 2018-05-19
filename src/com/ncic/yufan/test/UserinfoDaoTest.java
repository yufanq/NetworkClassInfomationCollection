package com.ncic.yufan.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ncic.yufan.dao.UserinfoDao;
import com.ncic.yufan.entity.Userinfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/com/ncic/yufan/util/applicationContext.xml")
public class UserinfoDaoTest {
	@Autowired
	private UserinfoDao userinfoDao;
	
	
	public UserinfoDao getUserinfoDao() {
		return userinfoDao;
	}

	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}

	@Test
	public void testInsertUserinfo() {
		Userinfo userinfo = new Userinfo();
		userinfo.setuName("yufan");
		userinfo.setuStdname("201577G0132");
		userinfo.setuAccount("yufan#0.51");
		userinfo.setuPassword("28917199");
		userinfo.setuQqnumber("289178199");
		
		userinfo.setuSubtime(new Date());
		userinfoDao.insertUserinfo(userinfo);
		System.out.println("插入成功");
	}

	@Test
	public void testDeleteUserinfoById() {
		Userinfo userinfo = new Userinfo();
		userinfo.setuStdname("201577G0128");
		userinfo = userinfoDao.queryUserinfoBystdName(userinfo);
		userinfoDao.deleteUserinfoById(userinfo.getuId());
		System.out.println("删除成功");
	}

	@Test
	public void testUpdataUserinfo() {
		Userinfo userinfo = new Userinfo();
		userinfo.setuStdname("201577G0132");
		userinfo = userinfoDao.queryUserinfoBystdName(userinfo);
		userinfo.setuStdname("201577G0128");
		userinfoDao.updataUserinfo(userinfo);
		System.out.println(userinfoDao.queryUserinfoBystdName(userinfo));
	}

	@Test
	public void testQueryUserinfoBystdName() {
		Userinfo userinfo = new Userinfo();
		userinfo.setuStdname("201577G0132");
		System.out.println(userinfoDao.queryUserinfoBystdName(userinfo));
	}

	@Test
	public void testQueryUserinfoBydesc() {
		System.out.println(userinfoDao.queryUserinfoBydesc());
	}

	@Test
	public void testQueryUserinfoByasc() {
		System.out.println(userinfoDao.queryUserinfoBydesc());
	}

}
