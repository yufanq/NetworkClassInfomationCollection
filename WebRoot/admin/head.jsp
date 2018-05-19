<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>   
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                	<s:if test="#session.useradmin == null">
                	<a class="btn btn-navbar" data-toggle="collapse" data-target=".navbar-inverse-collapse">
					<i class="icon-reorder shaded"></i>
				</a>

			  	<a class="brand" href="${pageContext.request.contextPath}/admin/index.jsp">
			  		网课信息提交查询
			  	</a>

				<div class="nav-collapse collapse navbar-inverse-collapse">
				
					<ul class="nav pull-right">

						<li><a href="${pageContext.request.contextPath}/admin/adminlogin.jsp">
							登录
						</a></li>
						<li><a href="#">
							忘记密码？
						</a></li>
					</ul>
				</div><!-- /.nav-collapse -->
                	</s:if>
                    <s:else>
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".navbar-inverse-collapse">
                        <i class="icon-reorder shaded"></i></a><a class="brand" href="#">Edmin </a>
                    <div class="nav-collapse collapse navbar-inverse-collapse">
                        <ul class="nav nav-icons">
                            <li class="active"><a href="#"><i class="icon-bar-chart"></i></a></li>
                            <li><a href="${pageContext.request.contextPath}/admin/queryUserinfo"><i class="icon-user"></i></a></li>
                            <li><a href="${pageContext.request.contextPath}/admin/queryUserinfoByplatform?id=0"><i class="icon-search"></i></a></li>
                        </ul>
                        <form class="navbar-search pull-left input-append" action="#">
                        <input type="text" class="span3">
                        <button class="btn" type="button">
                            <i class="icon-search"></i>
                        </button>
                        </form>
                        <ul class="nav pull-right">
                           
                            <li class="nav-user dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <img src="images/user.png" class="nav-avatar" />
                                <b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="${pageContext.request.contextPath}/admin/loginOut">Logout</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    <!-- /.nav-collapse -->
                    </s:else>
                </div>
            </div>
            <!-- /navbar-inner -->
        </div>
