$(function(){
	//检查 学号
	$('#uStdname').blur(function (){
		var stdname = $(this).val();
		
	})
	//检查 uName
	$('#uName').blur(function (){
		var uName = $(this).val();
		if(uName.length < 2){
	         $(this).css("color","red");
            
        }else{
        	 $(this).css("color","black");
             
        }
	});
	//检查uAccount
	$('#uAccount').blur(function (){
		var uAccount = $(this).val();
	});
	
	$('#uPassword').blur(function (){
		var uPassword = $(this).val();
		
	})
	
	$('#uQqnumber').blur(function (){
		var uQqnumber = $(this).val();
		var reg = /^\d{6,}$/;
		if(reg.test(uQqnumber)){
			 $(this).css("color","black");
		} else {
			 $(this).css("color","red");
		}
	});
	
	$('#uSebject').blur(function (){
		var uSebject = $(this).val();
		console.log("E");
	})

	$('#addSubject').click(function (){
		var last = $('#sub').parent().append('<input type="text" class="form-control" id="uSebject" placeholder="请输入选课科目">');
			console.log($('#sub').parent());
		$('#delSubject').prop("disabled","");
		console.log($('#delSubject'));
	});
	$('#delSubject').click(function (){
		
		var last = $('input:text').length - 1;
		$('input:text')[last].remove();
		if(last == 6){
			$(this).prop("disabled","disabled");
		}
	})
	
	$('#submitForm').click(function (){
		var input = $('input:text');
		var ssubjects= '' ;
		var smark ="";
		for(var i = 6;i < input.size();i++){
			var text = input.eq(i); 
			ssubjects += text.val()+'-';
			smark +="0";
		}
		var ustdname = $('#uStdname').val();
		var uname = $('#uName').val();
		var uaccount = $('#uAccount').val();
		var upassword = $('#uPassword').val();
		var uqqnumber = $('#uQqnumber').val();
		var splatform = $('#uPlatform').val();
		
		$.ajax({
			type:"post",
			url:"${pageContext.request.contextPath}/user/submitUserSubForm",
			data:"userinfo.uName="+uname+
				"&userinfo.uAccount="+uaccount+
				"&userinfo.uPassword="+upassword+
				"&userinfo.uQqnumber="+uqqnumber+
				"&userinfo.uStdname="+ustdname+
				"&subjectInfonation.sSubject="+ssubjects+
				"&subjectInfonation.sMark="+smark+
				"&subjectInfonation.sPlatform="+splatform,
			success:function(result){
				console.log("result:"+result);
				if("error" == result){
					$(location).prop('href', '/NetworkClassInfomationCollection/');
				} else if("success" == result){
					$(location).prop('href', '/NetworkClassInfomationCollection/success.jsp');
				}
				console.log("完成");
			}
		});
	})
	
});