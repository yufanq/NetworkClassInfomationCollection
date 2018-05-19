package com.ncic.yufan.dao;

import java.util.List;

import com.ncic.yufan.entity.SubjectInfonation;

/**
 * 
* @ClassName: SubjectInfonationDao  
* @Description: 对  ncic_subject_infonation 表的操作
* @author 雨ゆこ
* @date 2018年3月18日  
*  
*
 */
public interface SubjectInfonationDao {
	/**
	 * 
	* @Title: insertSubjectInfonation  
	* @Description:  添加 课程信息 
	* @param @param subjectInfonation    参数  
	* @return void    返回类型  
	* @throws
	 */
	void insertSubjectInfonation(SubjectInfonation subjectInfonation);
	/**
	 * 
	* @Title: deleteSubjectInfonation  
	* @Description:  删除课程信息 
	* @param @param subjectInfonation    参数  
	* @return void    返回类型  
	* @throws
	 */
	void deleteSubjectInfonation(SubjectInfonation subjectInfonation);
	/**
	 * 
	* @Title: updataSubjectInfonation  
	* @Description:  更新课程信息 
	* @param @param subjectInfonation    参数  
	* @return void    返回类型  
	* @throws
	 */
	void updataSubjectInfonation(SubjectInfonation subjectInfonation);
	/**
	 * 
	* @Title: findSubjectInfonation  
	* @Description:   查询所有选课信息
	* @param @return    参数  
	* @return List<SubjectInfonation>    返回类型  
	* @throws
	 */
	List<SubjectInfonation> findSubjectInfonation();
	/**
	 * 
	* @Title: findSubjectInfonationById  
	* @Description:  通过id查询选课数据
	* @param @param subjectInfonation
	* @param @return    参数  
	* @return SubjectInfonation    返回类型  
	* @throws
	 */
	SubjectInfonation findSubjectInfonationById(SubjectInfonation subjectInfonation);
	/**
	 * 
	* @Title: findSubjectInfonationBySubject  
	* @Description:  通过课程 模糊查询  选课信息 
	* @param @param subjectInfonation
	* @param @return    参数  
	* @return List<SubjectInfonation>    返回类型  
	* @throws
	 */
	List<SubjectInfonation> findSubjectInfonationBySubject(SubjectInfonation subjectInfonation);
	/**
	 * 
	* @Title: findSubjectInfonationByPlatform  
	* @Description:   通过平台查询选课信息
	* @param @param subjectInfonation
	* @param @return    参数  
	* @return List<SubjectInfonation>    返回类型  
	* @throws
	 */
	List<SubjectInfonation> findSubjectInfonationByPlatform(SubjectInfonation subjectInfonation);
}
