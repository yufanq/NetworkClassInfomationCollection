package com.ncic.yufan.service;

import com.ncic.yufan.entity.SubjectInfonation;
import com.ncic.yufan.entity.Userinfo;

/**
 * 
* @ClassName: InfonationService  
* @Description:  处理表单信息
* @author 雨ゆこ
* @date 2018年3月18日  
*  
*
 */
public interface InfonationService {
	/**
	 * 
	* @Title: saveUserinfo  
	* @Description:  提交Userinfo表的信息 
	* @param @param userinfo    参数  
	* @return void    返回类型  
	* @throws
	 */
	void saveUserinfo(Userinfo userinfo);
	/**
	 * 
	* @Title: saveSubjectInfonation  
	* @Description:   提交SubjectInfonation表的信息
	* @param @param subjectInfonation    参数  
	* @return void    返回类型  
	* @throws
	 */
	
	void saveSubjectInfonation(SubjectInfonation subjectInfonation);
	/**
	 * 
	* @Title: queryUidForInfonationBystdName  
	* @Description:  通过学号查询唯一的 Userinfo 的id 给 SubjectInfonation提供 外键 u_id  
	* @param @param userinfo
	* @param @return    参数  
	* @return Userinfo    返回类型  
	* @throws
	 */
	Userinfo queryUidForInfonationBystdName(Userinfo userinfo);

}
