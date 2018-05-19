package com.ncic.yufan.entity;
/**
 * 
* @ClassName: Admin  
* @Description: Admin 表实体 类 
* @author 雨ゆこ
* @date 2018年3月15日  
*  
*
 */
public class Admin {
	private Integer aid; //a_id
	private String aname; //a_name
	private String apassword; // a_password
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApassword() {
		return apassword;
	}
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aid == null) ? 0 : aid.hashCode());
		result = prime * result + ((aname == null) ? 0 : aname.hashCode());
		result = prime * result
				+ ((apassword == null) ? 0 : apassword.hashCode());
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
		Admin other = (Admin) obj;
		if (aid == null) {
			if (other.aid != null)
				return false;
		} else if (!aid.equals(other.aid))
			return false;
		if (aname == null) {
			if (other.aname != null)
				return false;
		} else if (!aname.equals(other.aname))
			return false;
		if (apassword == null) {
			if (other.apassword != null)
				return false;
		} else if (!apassword.equals(other.apassword))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "admin [aid=" + aid + ", aname=" + aname + ", apassword="
				+ apassword + "]";
	}
	
	
}
