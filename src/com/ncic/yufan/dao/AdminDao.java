package com.ncic.yufan.dao;

import org.apache.ibatis.annotations.Param;

import com.ncic.yufan.entity.Admin;



/**
 * 
* @ClassName: AdminDao  
* @Description:  admin表
* @author 雨ゆこ
* @date 2018年3月15日  
*  
*
 */
public interface AdminDao {
	/**
	 * 
	* @Title: selectAdminByNameAndPassword  
	* @Description: 根据用户名和密码查找 admin  
	* @param @param name
	* @param @param password
	* @param @return    参数  
	* @return Admin    返回类型  
	* @throws
	 */
	Admin selectAdminByNameAndPassword( @Param("name")String name,@Param("password")String password);
	
}
