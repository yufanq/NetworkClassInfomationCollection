package com.ncic.yufan.serviceimpl;

import java.util.List;

import com.ncic.yufan.dao.UserinfoDao;
import com.ncic.yufan.entity.Userinfo;
import com.ncic.yufan.service.UserinfoService;
/**
 * 
* @ClassName: UserinfoServiceImpl  
* @Description:  userinfo业务逻辑实现
* @author 雨ゆこ
* @date 2018年3月13日  
*  
*
 */
public class UserinfoServiceImpl implements UserinfoService{
	//  dao层对象接口  ，spring注入
	private UserinfoDao userinfoDao;
	public UserinfoDao getUserinfoDao() {
		return userinfoDao;
	}

	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}

	@Override
	public void saveUserinfo(Userinfo userinfo) {
		userinfoDao.insertUserinfo(userinfo);//添加
		
	}

	@Override
	public void modUserinfo(Userinfo userinfo) {
		userinfoDao.updataUserinfo(userinfo);//更改
		
	}

	@Override
	public void removeUserinfo(Userinfo userinfo) {
		userinfoDao.deleteUserinfoById(userinfo.getuId()); // 删除
		
	}

	@Override
	public List<Userinfo> queryUserinfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Userinfo> queryUserinfoBytime(boolean time) {
		if(time){
			return userinfoDao.queryUserinfoByasc();
		} else {
			return userinfoDao.queryUserinfoBydesc();
		}
	}

	@Override
	public Userinfo queryUserinfoById(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

