<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                    <a href="#" class="btn-box big span4"><i class=" icon-bar-chart"></i>
                                        <p class="text-muted">
                                            		图表</p>
                                    </a><a href="${pageContext.request.contextPath}/admin/queryUserinfo" class="btn-box big span4"><i class="icon-user"></i>
                                        <p class="text-muted">
                                      		     用户</p>
                                    </a><a href="${pageContext.request.contextPath}/admin/querySubjectInfonationByplatform?id=3" class="btn-box big span4"><i class="icon-search"></i>
                                        <p class="text-muted">
                                            	查询</p>
                                    </a>
                                </div>
                            </div>
                             
                    	</div>
                    </div>
   				</div>
   			</div>
   		</div>
   		<div class="footer">
		<div class="container">
				<b class="copyright">Copyright &copy; 2018.雨ゆこ.
		</div>
	</div>
  </body>
    <script src="scripts/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script src="scripts/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
    <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="scripts/flot/jquery.flot.js" type="text/javascript"></script>
    <script src="scripts/flot/jquery.flot.pie.js" type="text/javascript"></script>
    <script src="scripts/common.js" type="text/javascript"></script>
</html>
