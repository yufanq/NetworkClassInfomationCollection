<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png" />
	<link rel="icon" type="image/png" href="assets/img/favicon.png" />
	<title></title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />

	<!-- CSS Files -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
	<link href="assets/css/paper-bootstrap-wizard.css" rel="stylesheet" />

	<!-- CSS Just for demo purpose, don't include it in your project -->
	<link href="assets/css/demo.css" rel="stylesheet" />

	<!-- Fonts and Icons -->
    <link href="http://netdna.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.css" rel="stylesheet">
	<link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
	<link href="assets/css/themify-icons.css" rel="stylesheet">
</head>

<body>
	<div class="image-container set-full-height" style="background-image: url('assets/img/paper-2.jpeg')">
	     <!--   Big container   -->
	    <div class="container">
	        <div class="row">
		        <div class="col-sm-8 col-sm-offset-2">

		            <!--      Wizard container        -->
		            <div class="wizard-container">
		                <div class="card wizard-card" data-color="green" id="wizard">
		                    	<div class="wizard-header">
		                       		<h3 class="wizard-title">选课信息提交平台</h3>
									<p class="category">方便您的校园生活</p></div>
								<div class="wizard-navigation">
									<div class="progress-with-circle">
									    <div class="progress-bar" role="progressbar" aria-valuenow="1" aria-valuemin="1" aria-valuemax="4" style="width: 15%;"></div>
									</div>
									<ul>
			                            
			                            <li>
											<a href="#description" data-toggle="tab">
												<div class="icon-circle">
													<i class="ti-comments"></i>
												</div>
												完成
											</a>
										</li>
			                            
			                        </ul>
								</div>
		                          <div class="tab-content">
		                            <div class="tab-pane" id="description">
		                                <h5 class="info-text">提交表单成功，感谢您的配合！！！</h5>
		                           
		                            </div>
		                         </div>
		                    
		                </div>
		            </div> <!-- wizard container -->
		        </div>
	        </div> <!-- row -->
	    </div> <!--  big container -->

	    <div class="footer">
	        <div class="container text-center">
	        	Copyright &copy; 2018.雨ゆこ.<a
					target="_blank" href=""></a>  </div>
	    </div>
	</div>

</body>

	<!--   Core JS Files   -->
	<script src="assets/js/jquery-2.2.4.min.js" type="text/javascript"></script>
	<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="assets/js/jquery.bootstrap.wizard.js" type="text/javascript"></script>

	<!--  Plugin for the Wizard -->
	<script src="assets/js/paper-bootstrap-wizard.js" type="text/javascript"></script>

	<!--  More information about jquery.validate here: http://jqueryvalidation.org/	 -->
	<script src="assets/js/jquery.validate.min.js" type="text/javascript"></script>

</html>

