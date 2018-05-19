package com.ncic.yufan.service;

import java.util.List;

import com.ncic.yufan.bean.Page;
import com.ncic.yufan.bean.Userinfos;
import com.ncic.yufan.entity.Admin;
import com.ncic.yufan.entity.SubjectInfonation;
import com.ncic.yufan.entity.Userinfo;

/**
 * 
* @ClassName: AdminService  
* @Description: 管理员的业务 
* @author 雨ゆこ
* @date 2018年3月15日  
*  
*
 */
public interface AdminService {
	/**
	 * 
	* @Title: loginAdmin  
	* @Description: 登录操作  
	* @param @param admin
	* @param @return    参数  
	* @return Admin    返回类型  
	* @throws
	 */
	Admin loginAdmin(Admin admin);
	/**
	 * 
	* @Title: queryAllUserinfo  
	* @Description:  根据时间升降序 
	* @param @param time
	* @param @return    参数  
	* @return List<Userinfo>    返回类型  
	* @throws
	 */
	List<Userinfo> queryAllUserinfo(boolean time);
	/**
	 * 
	* @Title: removeUserinfoById  
	* @Description:  移出数据 
	* @param @param userinfo    参数  
	* @return void    返回类型  
	* @throws
	 */

	void removeUserinfoById(Userinfo userinfo);
	/**
	 * 
	* @Title: querySubjectInfonation  
	* @Description: 查询所有课程信息 
	* @param @return    参数  
	* @return List<SubjectInfonation>    返回类型  
	* @throws
	 */
	/**
	 * 
	* @Title: modUserinfo  
	* @Description:  更新用户信息 
	* @param @param userinfo    参数  
	* @return void    返回类型  
	* @throws
	 */
	void modUserinfo(Userinfo userinfo);
	List<SubjectInfonation> querySubjectInfonation();
	/**
	 * 
	* @Title: queryUserinfoByStdName  
	* @Description:  通过学号查询信息 
	* @param @param userinfo
	* @param @return    参数  
	* @return Userinfo    返回类型  
	* @throws
	 */
	Userinfo queryUserinfoByStdName(Userinfo userinfo);
	/**
	 * 
	* @Title: querySubjectInfonationById  
	* @Description:   通过id获得课程信息
	* @param @param subjectInfonation
	* @param @return    参数  
	* @return SubjectInfonation    返回类型  
	* @throws
	 */
	SubjectInfonation querySubjectInfonationById(SubjectInfonation subjectInfonation);
	
	/**
	 * 
	* @Title: querySubjectInfonationBySubject  
	* @Description:   通过课程查询信息  
	* @param @param subjectInfonation
	* @param @return    参数  
	* @return List<SubjectInfonation>    返回类型  
	* @throws
	 */
	List<SubjectInfonation> querySubjectInfonationBySubject(SubjectInfonation subjectInfonation);
	/**
	 * 
	* @Title: querySubjectInfonationByPlatform  
	* @Description:  通过平台查询信息
	* @param @param subjectInfonation
	* @param @return    参数  
	* @return List<SubjectInfonation>    返回类型  
	* @throws
	 */
	List<SubjectInfonation> querySubjectInfonationByPlatform(SubjectInfonation subjectInfonation);
	/**
	 * 
	* @Title: removeSubjectInfonationBysid  
	* @Description:   删除课程
	* @param @param subjectInfonation    参数  
	* @return void    返回类型  
	* @throws
	 */
	void removeSubjectInfonationBysid(SubjectInfonation subjectInfonation);
	/**
	 * 
	* @Title: modSubjectinfonamtion  
	* @Description:  更新选课信息  
	* @param @param subjectInfonation    参数  
	* @return void    返回类型  
	* @throws
	 */
	void modSubjectinfonamtion(SubjectInfonation subjectInfonation);
}
