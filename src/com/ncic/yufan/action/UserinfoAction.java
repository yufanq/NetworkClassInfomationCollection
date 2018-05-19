package com.ncic.yufan.action;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.http.HttpRequest;

import com.ncic.yufan.entity.Userinfo;
import com.ncic.yufan.service.UserinfoService;
import com.ncic.yufan.util.StructValueStackUtil;
import com.opensymphony.xwork2.ActionSupport;

public class UserinfoAction  extends ActionSupport{
	private UserinfoService userinfoService;
	private Userinfo userinfo;
	

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public UserinfoService getUserinfoService() {
		return userinfoService;
	}

	public void setUserinfoService(UserinfoService userinfoService) {
		this.userinfoService = userinfoService;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	// 
	public String listForm() {
		HttpServletRequest request = ServletActionContext.getRequest();
		try{
			String id = request.getParameter("sid");
			Integer sid = Integer.parseInt(id);
			if(1 == sid) {
				StructValueStackUtil.setRequesetAttrition("uPlatform", "智慧树");
			} else if (2 == sid){
				StructValueStackUtil.setRequesetAttrition("uPlatform", "超星尔雅");
			} else {
				return ERROR;
			}
			return SUCCESS;
		}catch (Exception e) {
			return ERROR;
		}
		
	}
	//表单插入跳转
	public String addUserinfo() throws Exception{
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = response.getWriter();
		if(userinfo == null){
				out.print("error");
			}
		try {
			Date date = new Date();          // 获取一个Date对象
			Timestamp timeStamp = new Timestamp(date.getTime());     //   讲日期时间转换为数据库中的timestamp类型
			userinfo.setuSubtime(timeStamp);
			userinfoService.saveUserinfo(userinfo);
			out.print("success");
		} catch (Exception e) {
			out.print("error");
		}
		return null;
	}
	
	

}
