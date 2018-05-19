package com.ncic.yufan.bean;

import java.util.List;

import com.ncic.yufan.entity.Userinfo;
/**
 * 
* @ClassName: Userinfos  
* @Description:  Userinfo 分页用bean
* @author 雨ゆこ
* @date 2018年3月15日  
*  
*
 */
public class Userinfos {
	private List<Userinfo> userinfoList;
	private Integer totalCount;
	public List<Userinfo> getUserinfoList() {
		return userinfoList;
	}
	public void setUserinfoList(List<Userinfo> userinfoList) {
		this.userinfoList = userinfoList;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	

}
