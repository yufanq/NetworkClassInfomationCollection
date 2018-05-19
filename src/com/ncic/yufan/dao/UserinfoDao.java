package com.ncic.yufan.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ncic.yufan.entity.Userinfo;
 /**
  * 
 * @ClassName: UserinfoDao  
 * @Description:  userinfo表的增删改查操作
 * @author 雨ゆこ
 * @date 2018年3月13日  
 *  
 *
  */
public interface UserinfoDao {
	/**
	 * 
	* @Title: insertUserinfo  
	* @Description:  添加userinfo数据 
	* @param @param userinfo    参数  
	* @return void    返回类型  
	* @throws
	 */
	void insertUserinfo(Userinfo userinfo);
	 /**
	  * 
	 * @Title: deleteUserinfoById  
	 * @Description:   删除userinfo数据
	 * @param @param uid    参数  
	 * @return void    返回类型  
	 * @throws
	  */
	void deleteUserinfoById(Integer uid);
	/**
	 * 
	* @Title: updataUserinfo  
	* @Description:  更新userinfo数据
	* @param @param userinfo    参数  
	* @return void    返回类型  
	* @throws
	 */
	void updataUserinfo(Userinfo userinfo);
	 /**
	  * 
	 * @Title: queryUserinfoBystdNmae  
	 * @Description: 根据stdName查询userinfo数据 
	 * @param @param userinfo
	 * @param @return    参数  
	 * @return Userinfo    返回类型  
	 * @throws
	  */
	Userinfo queryUserinfoBystdName(Userinfo userinfo);
	/**
	 * 
	* @Title: queryUserinfoBySubTime  
	* @Description:  根据数据查询userinfo数据
	* @param @param submit
	* @param @return    参数  
	* @return List<Userinfo>    返回类型  
	* @throws
	 */
	
	List<Userinfo> queryUserinfoBydesc();
	/**
	 * 
	* @Title: queryUserinfoByasc  
	* @Description: 升序查询userinfo所有 
	* @param @return    参数  
	* @return List<Userinfo>    返回类型  
	* @throws
	 */
	List<Userinfo> queryUserinfoByasc();

	
	
}
