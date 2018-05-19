<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<link rel="apple-touch-icon" sizes="76x76"
	href="assets/img/apple-icon.png" />
<link rel="icon" type="image/png" href="assets/img/favicon.png" />
<title></title>

<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'
	name='viewport' />
<meta name="viewport" content="width=device-width" />

<!-- CSS Files -->
<link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
<link href="../assets/css/paper-bootstrap-wizard.css" rel="stylesheet" />

<!-- CSS Just for demo purpose, don't include it in your project -->
<link href="../assets/css/demo.css" rel="stylesheet" />

<!-- Fonts and Icons -->
<link
	href="http://netdna.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.css"
	rel="stylesheet">
<link href='https://fonts.googleapis.com/css?family=Muli:400,300'
	rel='stylesheet' type='text/css'>
<link href="../assets/css/themify-icons.css" rel="stylesheet">
</head>

<body>
	<div class="image-container set-full-height"
		style="background-image: url('../assets/img/paper-2.jpeg')">
		<!--   Big container   -->
		<div class="container">
			<div class="row">
				<div class="col-sm-8 col-sm-offset-2">

					<!--      Wizard container        -->
					<div class="wizard-container">
						<div class="card wizard-card" data-color="green" id="wizard">
								<!--        You can switch " data-color="green" "  with one of the next bright colors: "blue", "azure", "orange", "red"       -->

								<div class="wizard-header">
									<h3 class="wizard-title">请填写您的选课信息</h3>
									<p class="category">方便您的校园生活</p>
								</div>
								<div class="wizard-navigation">
									<div class="progress-with-circle">
										<div class="progress-bar" role="progressbar" aria-valuenow="1"
											aria-valuemin="1" aria-valuemax="4" style="width: 15%;"></div>
									</div>
									<ul>

										<li><a href="#location" data-toggle="tab">
												<div class="icon-circle">
													<i class="ti-map"></i>
												</div> Location
										</a></li>

									</ul>
								</div>
								<div class="tab-content">
									<div class="tab-pane" id="location">
										<div class="row">
											<form action="" method="get" id='ncicForm' >
											<div class="col-sm-12">
												<h5 class="info-text">Let's start with the basic
													details</h5>
											</div>
											<div class="col-sm-5 col-sm-offset-1">
												<div class="form-group">
													<label>学号</label> <input type="text" class="form-control"
														id="uStdname"
														placeholder="请输入姓名">
												</div>
											</div>
											<div class="col-sm-5 col-sm-offset-1">
												<div class="form-group">
													<label>姓名</label> <input type="text" class="form-control"
														id="uName"
														placeholder="请输入姓名">
												</div>
											</div>
											<div class="col-sm-5 col-sm-offset-1">
												<div class="form-group">
													<label>账号</label> <input type="text" class="form-control"
														id="uAccount"
														placeholder="请输入账号">
												</div>
											</div>
											<div class="col-sm-5 col-sm-offset-1">
												<div class="form-group">
													<label>密码</label> <input type="text" class="form-control"
														id="uPassword"
														placeholder="请输入账号对于的密码">
												</div>
											</div>
										
											<div class="col-sm-5 col-sm-offset-1">
												<div class="form-group">
													<label>QQ</label> <input type="text" class="form-control"
														id="uQqnumber"
														placeholder="请输入使用的QQ号">
												</div>
											</div>
											
											<div class="col-sm-5 col-sm-offset-1">
												<div class="form-group">
													<label>平台</label> <input type="text" class="form-control"
														id="uPlatform"
														value="<s:property value="#request.uPlatform"/>" disabled="disabled">
												</div>
											</div>
											<div class="col-sm-5 col-sm-offset-1">
												<div class="form-group">
													<label id="sub">科目</label> 
													<input type="text" class="form-control"
														id="uSebject"
														placeholder="请输入选课科目">
												</div>
											</div>
											        <div class="wizard-footer">
	                            	<div class="pull-right">
	                                    <input type='button' id="addSubject" class='btn btn-finish btn-fill btn-success '  value='添加' />
	                                    <input type='button' id="delSubject" disabled="disabled"  class='btn btn-finish btn-fill btn-success '  value='删除' />
									</div>
	                                <div class="clearfix"></div>
		                        </div>
		                        <div>
		                               <input type="button"class='made-with-pk'  id="submitForm" value='提交' />
	                    			</div>
	                    			</form>
										</div>
									</div>
									
			<!-- row -->
		</div>
		<!--  big container -->

		<div class="footer">
			<div class="container text-center">
				Copyright &copy; 2018.雨ゆこ.<a
					target="_blank" href=""></a>
			</div>
		</div>
	</div>

</body>

<!--   Core JS Files   -->
<script src="../assets/js/jquery-2.2.4.min.js" type="text/javascript"></script>
<script src="../assets/js/formcheck.js" type="text/javascript"></script>
<script src="../assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="../assets/js/jquery.bootstrap.wizard.js"
	type="text/javascript"></script>

<!--  Plugin for the Wizard -->
<script src="../assets/js/paper-bootstrap-wizard.js" type="text/javascript"></script>

<!--  More information about jquery.validate here: http://jqueryvalidation.org/	 -->
<script src="../assets/js/jquery.validate.min.js" type="text/javascript"></script>

</html>

