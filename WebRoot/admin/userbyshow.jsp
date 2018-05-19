<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Edmin</title>
        <link type="text/css" href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link type="text/css" href="css/theme.css" rel="stylesheet">
        <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600'
            rel='stylesheet'>
             <script src="scripts/jquery-1.9.1.min.js" type="text/javascript"></script>
        <script src="scripts/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="scripts/flot/jquery.flot.js" type="text/javascript"></script>
        <script src="scripts/flot/jquery.flot.resize.js" type="text/javascript"></script>
        <script src="scripts/datatables/jquery.dataTables.js" type="text/javascript"></script>
        <script src="scripts/common.js" type="text/javascript"></script>
        <script type="text/javascript" src="scripts/event_deal.js"></script>
    </head>
  
  <body>
  	 <jsp:include page="head.jsp"></jsp:include>
       <!-- /navbar -->
        <div class="wrapper">
            <div class="container">
                <div class="row">
   					<jsp:include page="navbar.jsp"></jsp:include>
   					                 <!--/.span3-->
                    <div class="span9">
                        <div class="content">
                           <div class="module">
                                <div class="module-head">
                                    <h3>选课信息</h3>
                                 </div>
                       		<div class="control-group">
											<div class="controls">
											
													<td><a class="btn btn-info" href="${pageContext.request.contextPath}/admin/querySubjectInfonationByplatform?id=3">所有</a></td>
													<td><a class="btn btn-info" href="${pageContext.request.contextPath}/admin/querySubjectInfonationByplatform?id=0">智慧树</a></td>
													<td><a class="btn btn-info" href="${pageContext.request.contextPath}/admin/querySubjectInfonationByplatform?id=1">超星尔雅</a></td>
												
													
													<td>
														<form action="${pageContext.request.contextPath}/admin/querySubjectInfonationBySubjectAndPlatform" method="post" >
															<input type="hidden" name="subjectInfonation.sPlatform" value="<s:property value="#request.splatform"/>"/>
															<input  type="text" name="subjectInfonation.sSubject" placeholder="请输入需要查询的课程"/>
															<input type="submit" onclick="selectplatform(this)" value="提交" class="btn btn-info"></td>													
														</form>
												
											</div>
										</div>
                                <div class="module-body table">
                                    <table cellpadding="0" cellspacing="0" border="0" class="datatable-1 table table-bordered table-striped	 display"
                                        width="100%">
                                        <thead>
                                            <tr>
                                                <th>
                                                    	学号
                                                </th>
                                                <th>
                                                    	姓名
                                                </th>
                                                <th>
                                                    	平台
                                                </th>
                                                <th class="center">
                                                		科目
                                                </th>
                                                <th> 
                                                	提交时间
                                                </th>
                                                <th>
                                                	确认
                                                </th>
                                                <th>
                                                	操作
                                                	</th>
                                            </tr>
                                        </thead>
                                        <tbody id="ajaxChange">
                                           	<s:iterator value="#request.subjectInfonationList">
                                            <tr class="gradeU">
                                                <td>
                                                  <s:property value="userinfo.uStdname"/>
                                                </td>
                                                <td>
                                                	<s:property value="userinfo.uName"/>
                                                </td>
                                                <td>
                                                    <s:property value="sPlatform"/>
                                                </td>
                                                <td class="center">
                                                	
                                                			<s:iterator value="sSubject.split('-')" status="s">
                                            			<s:property />
                                                					<input type="checkbox" onclick="checkclassstatus(this,<s:property value="sId"/>)" value="<s:property />"
                                                			
                                                					<s:if test="sMark.charAt(#s.index)=='1'"> checked="checked"</s:if>
                                                					>
                                                				
                                                			</s:iterator>
                                                	
                                                </td>
                                                <td>
                                                
                                                <s:property value="sSubtime"/>
                                                </td>
                                                <td>
                                                	完成
                                                		
                                                	<input type="checkbox" value="成功" <s:if test="sMark.indexOf('0') == -1"> checked="checked"</s:if>
                                                	 onclick="setcheckbox(this,<s:property value="sId"/>)">
                                                </td>
                                                <td>
                                                <input onclick="deleteSubjectinfonaatin(this,<s:property value="sId"/>)" type="button" class="btn btn-info" value="删除"/>
                                                </td>
                                            </tr>
                                            </s:iterator>
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                                  <th>
                                                    	学号
                                                </th>
                                                <th>
                                                    	姓名
                                                </th>
                                                <th>
                                                    	平台
                                                </th>
                                                <th class="center">
                                                		科目
                                                </th>
                                                <th> 
                                                	提交时间
                                                </th>
                                                <th>
                                                	确认
                                                </th>
                                                <th>
                                                	操作
                                                	</th>
                                            </tr>
                                        </tfoot>
                                    </table>
                                </div>
                            </div>
                            <!--/.module-->
                        </div>
                        <!--/.content-->
                    </div>
                    <!--/.span9-->
                </div>
            </div>
            <!--/.container-->
        </div>
     <div class="footer">
		<div class="container">
				<b class="copyright">Copyright &copy; 2018.雨ゆこ.
		</div>
	</div>
      
     
    </body>
</html>