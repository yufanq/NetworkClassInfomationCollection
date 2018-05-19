package com.ncic.yufan.serviceimpl;

import java.util.List;

import com.ncic.yufan.bean.Page;
import com.ncic.yufan.bean.Userinfos;
import com.ncic.yufan.dao.AdminDao;
import com.ncic.yufan.dao.SubjectInfonationDao;
import com.ncic.yufan.dao.UserinfoDao;
import com.ncic.yufan.entity.Admin;
import com.ncic.yufan.entity.SubjectInfonation;
import com.ncic.yufan.entity.Userinfo;
import com.ncic.yufan.service.AdminService;

public class AdminServiceImpl implements AdminService{
	private AdminDao adminDao;
	private UserinfoDao userinfoDao;
	private SubjectInfonationDao subjectInfonationDao;
	

	public SubjectInfonationDao getSubjectInfonationDao() {
		return subjectInfonationDao;
	}

	public void setSubjectInfonationDao(SubjectInfonationDao subjectInfonationDao) {
		this.subjectInfonationDao = subjectInfonationDao;
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public UserinfoDao getUserinfoDao() {
		return userinfoDao;
	}

	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}

	@Override
	public Admin loginAdmin(Admin admin) {
		
		return adminDao.selectAdminByNameAndPassword(admin.getAname(), admin.getApassword());
	}


	@Override
	public List<Userinfo> queryAllUserinfo(boolean time) {
		if(time){
			return userinfoDao.queryUserinfoByasc();
		} else {
			return userinfoDao.queryUserinfoBydesc();
		}
	}

	
	@Override
	public void removeUserinfoById(Userinfo userinfo) {
		userinfoDao.deleteUserinfoById(userinfo.getuId());// 删除用户
		
	}

	@Override
	public void modUserinfo(Userinfo userinfo) {
		userinfoDao.updataUserinfo(userinfo);
		
	}

	@Override
	public List<SubjectInfonation> querySubjectInfonation() {
		return	subjectInfonationDao.findSubjectInfonation();
		
	}

	@Override
	public Userinfo queryUserinfoByStdName(Userinfo userinfo) {
		
		return userinfoDao.queryUserinfoBystdName(userinfo);
	}

	@Override
	public List<SubjectInfonation> querySubjectInfonationBySubject(
			SubjectInfonation subjectInfonation) {
		return subjectInfonationDao.findSubjectInfonationBySubject(subjectInfonation);
	}

	@Override
	public List<SubjectInfonation> querySubjectInfonationByPlatform(
			SubjectInfonation subjectInfonation) {
		return subjectInfonationDao.findSubjectInfonationByPlatform(subjectInfonation);
	}

	@Override
	public void removeSubjectInfonationBysid(SubjectInfonation subjectInfonation) {
		subjectInfonationDao.deleteSubjectInfonation(subjectInfonation);
		
	}

	@Override
	public void modSubjectinfonamtion(SubjectInfonation subjectInfonation) {
		subjectInfonationDao.updataSubjectInfonation(subjectInfonation);
	}

	@Override
	public SubjectInfonation querySubjectInfonationById(
			SubjectInfonation subjectInfonation) {
		return subjectInfonationDao.findSubjectInfonationById(subjectInfonation);
	}
}
