package com.ncic.yufan.entity;

import java.util.Date;

/**
 * 
* @ClassName: SubjectInfonation  
* @Description: ncic_subject_infonation 实体类
* @author 雨ゆこ
* @date 2018年3月18日  
*  
*
 */
public class SubjectInfonation {
	private Integer sId; 		//s_id 
	private String sPlatform;	//s_platform 平台
	private String sSubject;	//s_subject 课程
	private String sMark;		//s_mark 课程选择标记
	private Date sSubtime;	//s_subtime 登记时间
	private Userinfo userinfo;  //uid
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsPlatform() {
		return sPlatform;
	}
	public void setsPlatform(String sPlatform) {
		this.sPlatform = sPlatform;
	}
	public String getsSubject() {
		return sSubject;
	}
	public void setsSubject(String sSubject) {
		this.sSubject = sSubject;
	}
	public String getsMark() {
		return sMark;
	}
	public void setsMark(String sMark) {
		this.sMark = sMark;
	}

	
	public Date getsSubtime() {
		return sSubtime;
	}
	public void setsSubtime(Date sSubtime) {
		this.sSubtime = sSubtime;
	}
	public Userinfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sId == null) ? 0 : sId.hashCode());
		result = prime * result + ((sMark == null) ? 0 : sMark.hashCode());
		result = prime * result
				+ ((sPlatform == null) ? 0 : sPlatform.hashCode());
		result = prime * result
				+ ((sSubject == null) ? 0 : sSubject.hashCode());
		result = prime * result
				+ ((sSubtime == null) ? 0 : sSubtime.hashCode());
		result = prime * result
				+ ((userinfo == null) ? 0 : userinfo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubjectInfonation other = (SubjectInfonation) obj;
		if (sId == null) {
			if (other.sId != null)
				return false;
		} else if (!sId.equals(other.sId))
			return false;
		if (sMark == null) {
			if (other.sMark != null)
				return false;
		} else if (!sMark.equals(other.sMark))
			return false;
		if (sPlatform == null) {
			if (other.sPlatform != null)
				return false;
		} else if (!sPlatform.equals(other.sPlatform))
			return false;
		if (sSubject == null) {
			if (other.sSubject != null)
				return false;
		} else if (!sSubject.equals(other.sSubject))
			return false;
		if (sSubtime == null) {
			if (other.sSubtime != null)
				return false;
		} else if (!sSubtime.equals(other.sSubtime))
			return false;
		if (userinfo == null) {
			if (other.userinfo != null)
				return false;
		} else if (!userinfo.equals(other.userinfo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SubjectInfonation [sId=" + sId + ", sPlatform=" + sPlatform
				+ ", sSubject=" + sSubject + ", sMark=" + sMark + ", sSubtime="
				+ sSubtime + ", userinfo=" + userinfo + "]";
	}
	
}
