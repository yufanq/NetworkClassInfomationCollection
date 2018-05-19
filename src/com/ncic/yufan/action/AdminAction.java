package com.ncic.yufan.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ncic.yufan.bean.DateSerliazer;
import com.ncic.yufan.bean.Page;
import com.ncic.yufan.entity.Admin;
import com.ncic.yufan.entity.SubjectInfonation;
import com.ncic.yufan.entity.Userinfo;
import com.ncic.yufan.service.AdminService;
import com.ncic.yufan.util.StructValueStackUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.mail.util.QEncoderStream;

public class AdminAction extends ActionSupport{
	private AdminService adminService;
	private Admin admin;
	private Userinfo userinfo;
	private SubjectInfonation subjectInfonation;
	
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
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	/**
	 * 
	* @Title: loginAdmin  
	* @Description:  登录处理 
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public String loginAdmin() {
		Admin userAdmin;
		try{
			
			userAdmin = adminService.loginAdmin(admin);
			System.out.println("useradmin"+userAdmin);
			if(userAdmin != null){
				StructValueStackUtil.setSessionAttribute("useradmin", userAdmin);
				return SUCCESS;
			} else {
				return LOGIN;
			}
			
		}catch(Exception e){
			e.printStackTrace();
			return LOGIN;
		}
	}
	/**
	 * 
	* @Title: queryUserinfo  
	* @Description:  查询所有数据
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public String queryUserinfo(){
		HttpServletRequest request = ServletActionContext.getRequest();
		try{
			
			Boolean time = Boolean.parseBoolean(request.getParameter("time"));
			
			List<Userinfo> userinfos = adminService.queryAllUserinfo(time);
		
			StructValueStackUtil.setRequesetAttrition("userList", userinfos);
			return SUCCESS;
		}catch(Exception e){
			return ERROR;
		}
	}
	/**
	 * 
	* @Title: changeTable  
	* @Description:  ajax 按提交的时间 来管理 数据表 
	* @param @return
	* @param @throws IOException    参数  
	* @return String    返回类型  
	* @throws
	 */
	public String changeTable() throws IOException{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("text/text;charset=UTF8");
		PrintWriter out = response.getWriter();
		try{
			//获取传回来的时间参数 true  升序   false 降序 查找
			Boolean time = Boolean.parseBoolean(request.getParameter("time"));
			List<Userinfo> userinfos = adminService.queryAllUserinfo(time);
			// 将查询到的数据 封装 成 json
			GsonBuilder gb = new GsonBuilder();
			gb.registerTypeAdapter(Date.class, new DateSerliazer());
			Gson gson = gb.create();
			String userJson = gson.toJson(userinfos);
//			userJson = URLDecoder.decode(userJson, "UTF-8");
			 // 回传
			out.print(userJson);
			return null;
		}catch(Exception e){
			out.print("error");
			return null;
		}
	}
	/**
	 * 
	* @Title: loginOut  
	* @Description:   注销登录
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public String loginOut(){
		StructValueStackUtil.setSessionAttribute("useradmin",null);
		return ERROR;
	}
	/**
	 * 
	* @Title: removeUesrinfo  
	* @Description:  删除userinfo
	* @param @return
	* @param @throws IOException    参数  
	* @return String    返回类型  
	* @throws
	 */
	public String removeUesrinfo() throws IOException{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/text;charset=UTF8");
		PrintWriter out = response.getWriter();
		try{
			 adminService.removeUserinfoById(userinfo);
			 out.print("success");
			
		}catch(Exception e){
			out.print("error");
		}
		return null;
	}
	/**
	 * 
	* @Title: querySubjectInfonationByplatform  
	* @Description:  根据平台查询信息
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public String querySubjectInfonationByplatform(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("id");
		subjectInfonation = new SubjectInfonation();
		List<SubjectInfonation> subjectInfonations;
		
		try{
			if("0".equals(id)){
				subjectInfonation.setsPlatform("智慧树");
				subjectInfonations = adminService.querySubjectInfonationByPlatform(subjectInfonation);
			} else if("1".equals(id)){
				subjectInfonation.setsPlatform("超星尔雅");
				subjectInfonations = adminService.querySubjectInfonationByPlatform(subjectInfonation);
			}else{
				subjectInfonations = adminService.querySubjectInfonation();
			}
			StructValueStackUtil.setRequesetAttrition("splatform", subjectInfonation.getsPlatform());
			StructValueStackUtil.setRequesetAttrition("subjectInfonationList", subjectInfonations);
			return SUCCESS;

		}catch(Exception e){
			return LOGIN;
		}
	}
	/**
	 * 
	* @Title: modSubjectInfonation  
	* @Description:  课程完成情况更新
	* @param @return
	* @param @throws IOException    参数  
	* @return String    返回类型  
	* @throws
	 */
	public  String modSubjectInfonation() throws IOException{
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out  = response.getWriter();
		try{
			//获得需要修改的对象的其他信息
			SubjectInfonation s = adminService.querySubjectInfonationById(subjectInfonation);
			//插入需要修改的值
			s.setsMark(subjectInfonation.getsMark());
			//更新数据
			adminService.modSubjectinfonamtion(s);
			out.print("success");
		}catch(Exception e){
			e.printStackTrace();
			out.print("fail");
		}
		return null;
	}
	/**
	 * 
	* @Title: querySubjectInfonationBySubjectAndPlatform  
	* @Description:  根据课程或平台查找
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public String querySubjectInfonationBySubjectAndPlatform(){
		System.out.println("获得："+subjectInfonation);
		List<SubjectInfonation> subjectInfonations = adminService.querySubjectInfonationBySubject(subjectInfonation);
		StructValueStackUtil.setRequesetAttrition("subjectInfonationList", subjectInfonations);
		return SUCCESS;
		
	}
	/**
	 * 
	* @Title: removeSubjectInfonation  
	* @Description:  移出课程
	* @param @return
	* @param @throws IOException    参数  
	* @return String    返回类型  
	* @throws
	 */
	public String removeSubjectInfonation() throws IOException{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/text;charset=UTF8");
		PrintWriter out = response.getWriter();
		try{
			 adminService.removeSubjectInfonationBysid(subjectInfonation);;
			 out.print("success");
			
		}catch(Exception e){
			out.print("error");
		}
		return null;
	}
	public String modUserinfo() throws IOException{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/text;charset=UTF8");
		PrintWriter out = response.getWriter();
		try{
			 Userinfo u = adminService.queryUserinfoByStdName(userinfo);
			 u.setuAccount(userinfo.getuAccount());
			 u.setuPassword(userinfo.getuPassword());
			 adminService.modUserinfo(u);
			 Gson g = new Gson();
			 String result = g.toJson(u);
			 System.out.println("result:"+result);
			 out.print(result);
			
		}catch(Exception e){
			out.print("error");
		}
		return null;
	}
}
