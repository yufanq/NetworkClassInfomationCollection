package com.ncic.yufan.service;

import java.util.List;

import com.ncic.yufan.entity.Userinfo;

/**
 * 
* @ClassName: UserinfoService  
* @Description:  userinfo操作服务类
* @author 雨ゆこ
* @date 2018年3月13日  
*  
*
 */
public interface UserinfoService {
	 
	/**
	 * 
	* @Title: saveUserinfo  
	* @Description:   添加userinfo对象
	* @param @param userinfo    参数  
	* @return void    返回类型  
	* @throws
	 */
	void saveUserinfo(Userinfo userinfo);
	/**
	 * 
	* @Title: modUserinfo  
	* @Description:  修改userinfo对象
	* @param @param uerinfo    参数  
	* @return void    返回类型  
	* @throws
	 */
	void modUserinfo(Userinfo userinfo);
	/**
	 * 
	* @Title: removeUserinfo  
	* @Description:  删除userinfo对象
	* @param @param userinfo    参数  
	* @return void    返回类型  
	* @throws
	 */
	void removeUserinfo(Userinfo userinfo);
	 /**
	  * 
	 * @Title: queryUserinfo  
	 * @Description:  查询所有
	 * @param     参数  
	 * @return void    返回类型  
	 * @throws
	  */
	List<Userinfo> queryUserinfo();
	/**
	 * 
	* @Title: queryUserinfoBytime  
	* @Description:   根据插入时间查询 
	* @param @param time
	* @param @return    参数  
	* @return List<Userinfo>    返回类型  
	* @throws
	 */
	List<Userinfo> queryUserinfoBytime(boolean time);
	/**
	 * 
	* @Title: queryUserinfoById  
	* @Description: 根据 id查询数据 
	* @param @param uid
	* @param @return    参数  
	* @return Userinfo    返回类型  
	* @throws
	 */
	Userinfo queryUserinfoById(Integer uid);

	
}
