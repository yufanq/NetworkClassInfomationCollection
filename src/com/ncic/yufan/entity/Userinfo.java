package com.ncic.yufan.entity;

import java.util.Date;

/**
 * 
* @ClassName: Userinfo  
* @Description:  ncic_userinfo表实体
* @author 雨ゆこ
* @date 2018年3月13日  
*  
*
 */
public class Userinfo {
	private Integer uId; // u_id
	private String uStdname; // u_stdname
	private String uName; // u_name 姓名
	private String uAccount; //u_account 账号
	private String uPassword; // u_password 密码
 	private String uQqnumber; // u_qqnumber QQ号
	private Date uSubtime; // u_subtime  提交时间
	private SubjectInfonation subjectInfonation; // subjectinfonation
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
	
		this.uId = uId;
	}
	public String getuStdname() {
		return uStdname;
	}
	public void setuStdname(String uStdname) {
		this.uStdname = uStdname;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuAccount() {
		return uAccount;
	}
	public void setuAccount(String uAccount) {
		this.uAccount = uAccount;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuQqnumber() {
		return uQqnumber;
	}
	public void setuQqnumber(String uQqnumber) {
		this.uQqnumber = uQqnumber;
	}
	public Date getuSubtime() {
		return uSubtime;
	}
	public void setuSubtime(Date uSubtime) {
		this.uSubtime = uSubtime;
	}
	public SubjectInfonation getSubjectInfonation() {
		return subjectInfonation;
	}
	public void setSubjectInfonation(SubjectInfonation subjectInfonation) {
		this.subjectInfonation = subjectInfonation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((subjectInfonation == null) ? 0 : subjectInfonation
						.hashCode());
		result = prime * result
				+ ((uAccount == null) ? 0 : uAccount.hashCode());
		result = prime * result + ((uId == null) ? 0 : uId.hashCode());
		result = prime * result + ((uName == null) ? 0 : uName.hashCode());
		result = prime * result
				+ ((uPassword == null) ? 0 : uPassword.hashCode());
		result = prime * result
				+ ((uQqnumber == null) ? 0 : uQqnumber.hashCode());
		result = prime * result
				+ ((uStdname == null) ? 0 : uStdname.hashCode());
		result = prime * result
				+ ((uSubtime == null) ? 0 : uSubtime.hashCode());
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
		Userinfo other = (Userinfo) obj;
		if (subjectInfonation == null) {
			if (other.subjectInfonation != null)
				return false;
		} else if (!subjectInfonation.equals(other.subjectInfonation))
			return false;
		if (uAccount == null) {
			if (other.uAccount != null)
				return false;
		} else if (!uAccount.equals(other.uAccount))
			return false;
		if (uId == null) {
			if (other.uId != null)
				return false;
		} else if (!uId.equals(other.uId))
			return false;
		if (uName == null) {
			if (other.uName != null)
				return false;
		} else if (!uName.equals(other.uName))
			return false;
		if (uPassword == null) {
			if (other.uPassword != null)
				return false;
		} else if (!uPassword.equals(other.uPassword))
			return false;
		if (uQqnumber == null) {
			if (other.uQqnumber != null)
				return false;
		} else if (!uQqnumber.equals(other.uQqnumber))
			return false;
		if (uStdname == null) {
			if (other.uStdname != null)
				return false;
		} else if (!uStdname.equals(other.uStdname))
			return false;
		if (uSubtime == null) {
			if (other.uSubtime != null)
				return false;
		} else if (!uSubtime.equals(other.uSubtime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Userinfo [uId=" + uId + ", uStdname=" + uStdname + ", uName="
				+ uName + ", uAccount=" + uAccount + ", uPassword=" + uPassword
				+ ", uQqnumber=" + uQqnumber + ", uSubtime=" + uSubtime
				+ ", subjectInfonation=" + subjectInfonation + "]";
	}
		
}
