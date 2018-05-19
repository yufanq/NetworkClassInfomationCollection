package com.ncic.yufan.bean;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * 
* @ClassName: DateSerliazer  
* @Description:   转json对象时 对 Date类型的数据  做规范化的处理
* @author 雨ゆこ
* @date 2018年3月16日  
*  
*
 */

public class DateSerliazer  implements JsonSerializer<Date>{

	@Override
	public JsonElement serialize(Date arg0, Type arg1,
			JsonSerializationContext arg2) {
		//确定输出格式
		SimpleDateFormat sDF = new SimpleDateFormat("yyyy-MM-dd");
		String ds = sDF.format(arg0);
		
		return new JsonPrimitive(ds);
	}

}
