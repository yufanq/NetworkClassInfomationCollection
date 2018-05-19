package com.ncic.yufan.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ncic.yufan.entity.Admin;
import com.ncic.yufan.util.StructValueStackUtil;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class adminInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Admin admin = (Admin) StructValueStackUtil.getSessionAttribute("useradmin");
		HttpServletRequest request = ServletActionContext.getRequest();
		String url = request.getRequestURI();
		System.out.println(url);
		if(!url.contains("loginAdmin") && admin == null ){
			System.out.println("拦截"+url);
			return "adminLoginError";
		}
		invocation.invoke();
		return null;
		
	}

}
