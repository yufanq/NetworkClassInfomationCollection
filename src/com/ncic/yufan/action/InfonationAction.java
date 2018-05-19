package com.ncic.yufan.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.ncic.yufan.entity.SubjectInfonation;
import com.ncic.yufan.entity.Userinfo;
import com.ncic.yufan.service.InfonationService;
import com.opensymphony.xwork2.ActionSupport;

public class InfonationAction extends ActionSupport {
	private InfonationService infonationService;
	private Userinfo userinfo;
	private SubjectInfonation subjectInfonation;
	public InfonationService getInfonationService() {
		return infonationService;
	}

	public void setInfonationService(InfonationService infonationService) {
		this.infonationService = infonationService;
	}

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public SubjectInfonation getSubjectInfonation() {
		return subjectInfonation;
	}

	public void setSubjectInfonation(SubjectInfonation subjectInfonation) {
		this.subjectInfonation = subjectInfonation;
	}
	
	public String submitUserSubForm() throws IOException{
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = response.getWriter();
		try{
			System.out.println("User"+userinfo);
			System.out.println("sub"+subjectInfonation);
			//完善信息
			userinfo.setuSubtime(new Date());
			subjectInfonation.setsSubtime(new Date());
			//添加用户
			infonationService.saveUserinfo(userinfo);
			// 查询添加用户的id
			userinfo = infonationService.queryUidForInfonationBystdName(userinfo);
			subjectInfonation.setUserinfo(userinfo);
			//添加选课信息
			infonationService.saveSubjectInfonation(subjectInfonation);
			
			out.print("success");
		}catch(Exception e){
			out.print("error");
		}
		return null;
	}
	
}
