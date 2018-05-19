package com.ncic.yufan.util;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 
* @ClassName: StructValueStackUtil   
* @Description: 
* @author 雨ゆこ　yu0214fan.gmail.com    
* @date 2017年10月21日 上午10:01:29   
*
 */
public class StructValueStackUtil {

	/**
	 * 
	* @Title: getValueStack   
	* @Description: 
	* @param @return       
	* @return ValueStack       
	* @throws
	 */
	public static ValueStack getValueStack(){
		ActionContext context = ActionContext.getContext();
		return  context.getValueStack();
	}
	
	/**
	 * 
	* @Title: setSessionAttribute   
	* @Description:  添加一个 session
	* @param @param Ognl
	* @param @param value       
	* @return void       
	* @throws
	 */
	public  static  void     setSessionAttribute(String  OGNL,Object  value){
		ActionContext context = ActionContext.getContext();
		ValueStack valueStack = context.getValueStack();
		valueStack.setValue("#session."+OGNL,value);	
	}
	
	
	/**
	 * 
	* @Title: getSessionAttribute   
	* @Description: 获取 一个Session值 
	* @param @param Ognl
	* @param @return       
	* @return Object       
	* @throws
	 */
	public static Object getSessionAttribute(String Ognl){
		ActionContext context = ActionContext.getContext();
		ValueStack valueStack = context.getValueStack();
		return valueStack.findValue("#session."+Ognl);
		
	}
	/**
	 * 
	* @Title: setApplicationAttribute   
	* @Description: 设置一个 Application 
	* @param @param Ognl
	* @param @param value       
	* @return void       
	* @throws
	 */
	public static void setApplicationAttribute(String Ognl,Object value){
		ActionContext context = ActionContext.getContext();
		ValueStack valueStack = context.getValueStack();
		valueStack.setValue("#application."+Ognl, value);
	}
	/**
	 * 
	* @Title: getApplicationAttribute   
	* @Description:  取得一个application 
	* @param @param Ognl
	* @param @return       
	* @return Object       
	* @throws
	 */
	public static Object getApplicationAttribute(String Ognl){
		ActionContext context = ActionContext.getContext();
		ValueStack valueStack = context.getValueStack();
		return valueStack.findValue("#application."+Ognl);
	}
	
	/**
	 * 
	* @Title: setRequesetAttrition   
	* @Description: 
	* @param @param Ognl
	* @param @param value       
	* @return void       
	* @throws
	 */
	public static void setRequesetAttrition(String Ognl,Object value){
		ActionContext context = ActionContext.getContext();
		ValueStack valueStack = context.getValueStack();
		valueStack.setValue("#request."+Ognl, value);
	}
	/**
	 * 
	* @Title: getRequestAttrition   
	* @Description: 
	* @param @param Ognl
	* @param @return       
	* @return Object       
	* @throws
	 */
	public static Object getRequestAttrition(String Ognl){
		ActionContext context = ActionContext.getContext();
		ValueStack valueStack = context.getValueStack();
		return valueStack.findValue("#request."+Ognl);
	}
}
