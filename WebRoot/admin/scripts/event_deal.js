
$(function(){
	$('select').change(function(){
		alert("sd")
	});
	$('#btn').click(function (){
		alert("sd");
	})
	
	

})

function selectplatform(id){
	var platform = $(id).prev().prev(); 
	var subject =$(id).prev();
	console.log(platform.val());
	console.log(subject.val());
}
function moduserinfo(id){
	var s = $(id).parent().parent().children();
	var text = new Array([5]);
	for(var i = 0;i < 5;i++){
		var val ;
		if(i == 2 || i == 3){
			val = s.eq(i).children().val();
		}else{
			val = s.eq(i).text();
		}
		text[i] = val;
		console.log(text[i]);
	}
	$.ajax({
		type:"post",
		url:"${pageContext.request.contextPath}/admin/modUserinfo",
		data:"userinfo.uStdname="+text[0]+
			"&userinfo.uName="+text[1]+
			"&userinfo.uAccount="+text[2]+
			"&userinfo.uPassword="+text[3]+
			"&userinfo.uQqnumber="+text[4],
		success:function(result){
			console.log(result);
			if("error" != result){
				var data = JSON.parse(result);
				var text ="<td>"+data.uStdname+"</td><td>"+data.uName+"</td><td>"+data.uAccount+"</td><td>"+data.uPassword+"</td><td class='center'>"+data.uQqnumber+"</td><td><input onclick='ck(this)' type='button'  value='修改'/></td><td><input onclick='deleteUserinfo(this,"+data.uId+")' type='button' value='删除'/></td>";
				var tr = $(id).parent().parent();
				tr.empty().append(text);
				alert("修改成功");
			}
		}
	
	});
		
}
function ck(id){
	var s = $(id).parent().parent().children();
	var text = "";
	for(var i = 0;i < s.length;i++){
		var val = s[i].innerText;
		if(i == 2 || i == 3){
			text+="<td><input type='text' style='width:125px' value='"+val+"'/></td>"
		}else if(i == 5){
			text += "<td><input onclick='moduserinfo(this)'  type='button'  value='完成'/></td>";
		}else if(i == 6){
			text += "<td> <input  type='button' value='删除' disabled='disabled'/></td>"
		}else{
			text+="<td>"+val+"</td>";
		}
	}
		var tr = $(id).parent().parent();
		tr.empty().append(text);
}
function chTime(id){
	var value = $("select:eq(0) :selected")[0].value;
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath}/admin/changeTable",
		data:"time="+value,
		success:function(result){
			if(result != "error"){
				var data = JSON.parse(result);
				console.log(data[1].uSubtime);
				$('#ajaxChange').empty();
				for(var i = 0;i < data.length;i++){
					$('#ajaxChange').append('<tr class="gradeU">   <td> '+data[i].uName+'  </td>   <td>'+data[i].uAccount+' </td>   <td> '+data[i].uPassword+'  </td>     <td class="center"> '+data[i].uQqnumber+'  </td>    <td class="center"> '+data[i].uPlatForm+' </td>  <td>'+data[i].uSubject+'  </td>  <td> '+data[i].uSubtime+'</td><td><input onclick="ck(this)" type="button"  value="确认"></td><td> <input onclick="deleteUserinfo(this,'+data[i].uId+')" type="button" value="删除"/></td></tr>');
					
				}
			}
			
		}
	}); 
}


function deleteUserinfo(a,id){
	
	if(confirm('是否确定删除？')){
		$.ajax({
			type:"post",
			url:"${pageContext.request.contextPath}/admin/removeUesrinfo",
			data:"uid="+id,
			success:function(result){
				if("success" == result){
					$(a).parent().parent().remove();
					alert("删除成功");
				}
			}
		
		});
	} else{
	
	}
}

function deleteSubjectinfonaatin(a,id){
	if(confirm('是否确定删除？')){
		$.ajax({
			type:"post",
			url:"${pageContext.request.contextPath}/admin/removeSubjectInfonation",
			data:"subjectInfonation.sId="+id,
			success:function(result){
				if("success" == result){
					$(a).parent().parent().remove();
					alert("删除成功");
				}
			}
		
		});
	} else{
	
	}
}

function setcheckbox(id,sid){

	var inputs=$(id).parent().prev().prev().children();
	var text = "";
	for(var i=0;i<inputs.length;i++){
    	if($(id)[0].checked){
    		inputs.eq(i).prop("checked","checked");
    		text+="1";
    	}else{
    		inputs.eq(i).prop("checked","");
    		text+="0";
    	}
	}
	$.ajax({
		type:"post",
		url:"${pageContext.request.contextPath}/admin/modSubjectInfonation",
		data:"subjectInfonation.sId="+sid+
			 "&subjectInfonation.sMark="+text,
		success:function(result){
				console.log(result);
		}
	});
}

function checkclassstatus(id,sid){
	var input = $(id).parent().next().next().children();
	var inputs = $(id).parent().children();
	console.log(inputs);
	var count = 0;
	var text = "";
	for(var i=0;i<inputs.length;i++){
		if(inputs[i].checked){
			text+="1";
			count++;
		}else{
			text+="0";
		}
	}
	console.log(text);
	if(count == inputs.length){
		input.prop("checked","checked");
	} else {
		input.prop("checked","");
	}
	$.ajax({
		type:"post",
		url:"${pageContext.request.contextPath}/admin/modSubjectInfonation",
		data:"subjectInfonation.sId="+sid+
			 "&subjectInfonation.sMark="+text,
		success:function(result){
				console.log(result);
		}
	});
}


	