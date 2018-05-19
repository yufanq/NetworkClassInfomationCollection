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
												<select id="my" onchange="chTime()" tabindex="1" data-placeholder="Select here.." class="span1">
													<option value="true">升序</option>
													<option value="false">降序</option>
												</select>
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
                                                    	账号
                                                </th>
                                                <th>
                                                    	密码
                                                </th>
                                                <th>
                                                    	QQ号
                                                </th>
                                                <th>
                                                	修改
                                                </th>
                                                <th>
                                                	操作
                                                	</th>
                                            </tr>
                                        </thead>
                                        <tbody id="ajaxChange">
                                           	<s:iterator value="#request.userList">
                                            <tr class="gradeU">
                                                <td>
                                                	<s:property value="uStdname"/>
                                                </td>
                                                <td>
                                                  <s:property value="uName"/>
                                                </td>
                                                <td>
                                                	<s:property value="uAccount"/>
                                                </td>
                                                <td>
                                                    <s:property value="uPassword"/>
                                                </td>
                                                <td class="center">
                                                    <s:property value="uQqnumber"/>
                                                </td>
                                                <td>
                                                	<input onclick="ck(this)" type="button"  value="修改"/>
                                                </td>
                                                <td>
                                                <input onclick="deleteUserinfo(this,<s:property value="uId"/>)" type="button" value="删除"/>
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
                                                    	账号
                                                </th>
                                                <th>
                                                    	密码
                                                </th>
                                                <th>
                                                    	QQ号
                                                </th>
                                                <th>
                                                	修改
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