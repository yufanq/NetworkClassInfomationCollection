package com.ncic.yufan.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ncic.yufan.dao.SubjectInfonationDao;
import com.ncic.yufan.entity.SubjectInfonation;
import com.ncic.yufan.entity.Userinfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/com/ncic/yufan/util/applicationContext.xml")
public class SubjectInfonationDaoTest {
	@Autowired
	private SubjectInfonationDao subjectInfonationDao;
	
	
	public SubjectInfonationDao getSubjectInfonationDao() {
		return subjectInfonationDao;
	}

	public void setSubjectInfonationDao(SubjectInfonationDao subjectInfonationDao) {
		this.subjectInfonationDao = subjectInfonationDao;
	}

	@Test
	public void testInsertSubjectInfonation() {
		SubjectInfonation subjectInfonation = new SubjectInfonation();
		subjectInfonation.setsMark("00000");
		subjectInfonation.setsPlatform("智慧树");
		subjectInfonation.setsSubject("日语-英语-高数");
		Userinfo userinfo = new Userinfo();
		userinfo.setuId(2);
		subjectInfonation.setsSubtime(new Date());
		subjectInfonation.setUserinfo(userinfo);
		subjectInfonationDao.insertSubjectInfonation(subjectInfonation);
		System.out.println("插入成功");
	}

	@Test
	public void testDeleteSubjectInfonation() {
		SubjectInfonation subjectInfonation = new SubjectInfonation();
		subjectInfonation.setsId(1);
		subjectInfonationDao.deleteSubjectInfonation(subjectInfonation);
		System.out.println("删除成功");
	}

	@Test
	public void testUpdataSubjectInfonation() {
		SubjectInfonation subjectInfonation = new SubjectInfonation();
		subjectInfonation.setsId(1);
		subjectInfonation.setsMark("11111");
		subjectInfonation.setsPlatform("智慧树");
		subjectInfonation.setsSubject("数学-英语");
		Userinfo userinfo = new Userinfo();
		userinfo.setuId(2);
		subjectInfonation.setsSubtime(new Date());
		subjectInfonation.setUserinfo(userinfo);
		subjectInfonationDao.updataSubjectInfonation(subjectInfonation);
		System.out.println("更新成功");
	}

	@Test
	public void testFindSubjectInfonation() {
		System.out.println(subjectInfonationDao.findSubjectInfonation());
	}

	@Test
	public void testFindSubjectInfonationBySubject() {
		SubjectInfonation subjectInfonation = new SubjectInfonation();
		subjectInfonation.setsPlatform("超星尔雅");
		subjectInfonation.setsSubject("数学");
		System.out.println(subjectInfonationDao.findSubjectInfonationBySubject(subjectInfonation));
	}

	@Test
	public void testFindSubjectInfonationByPlatform() {
		SubjectInfonation subjectInfonation = new SubjectInfonation();
		subjectInfonation.setsPlatform("智慧树");
		System.out.println(subjectInfonationDao.findSubjectInfonationByPlatform(subjectInfonation));
	}
	@Test
	public void testfindSubjectInfonationById(){
		SubjectInfonation subjectInfonation = new SubjectInfonation();
		subjectInfonation.setsId(2);
		System.out.println(subjectInfonationDao.findSubjectInfonationById(subjectInfonation));
	}
}
