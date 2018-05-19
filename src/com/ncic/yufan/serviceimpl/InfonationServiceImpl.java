package com.ncic.yufan.serviceimpl;

import com.ncic.yufan.dao.SubjectInfonationDao;
import com.ncic.yufan.dao.UserinfoDao;
import com.ncic.yufan.entity.SubjectInfonation;
import com.ncic.yufan.entity.Userinfo;
import com.ncic.yufan.service.InfonationService;
/**
 * 
* @ClassName: InfonationServiceImpl  
* @Description:  用户提交信息的业务逻辑处理类
* @author 雨ゆこ
* @date 2018年3月18日  
*  
*
 */
public class InfonationServiceImpl implements InfonationService{
	private UserinfoDao userinfoDao;
	private SubjectInfonationDao subjectInfonationDao;
	
	
	public UserinfoDao getUserinfoDao() {
		return userinfoDao;
	}

	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}

	public SubjectInfonationDao getSubjectInfonationDao() {
		return subjectInfonationDao;
	}

	public void setSubjectInfonationDao(SubjectInfonationDao subjectInfonationDao) {
		this.subjectInfonationDao = subjectInfonationDao;
	}

	@Override
	public void saveUserinfo(Userinfo userinfo) {
		userinfoDao.insertUserinfo(userinfo);// 提交 userinfo
	}

	@Override
	public void saveSubjectInfonation(SubjectInfonation subjectInfonation) {
		subjectInfonationDao.insertSubjectInfonation(subjectInfonation); // 提交信息
		
	}

	@Override
	public Userinfo queryUidForInfonationBystdName(Userinfo userinfo) {
		// 查询用户id
		return userinfoDao.queryUserinfoBystdName(userinfo);
		
	}




}
