<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="css/layui.css" media="all">
  <link rel="stylesheet" href="css/admin.css" media="all">
  <link rel="stylesheet" href="css/login.css" media="all">
</head>
<body>
<div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">

   <div class="layadmin-user-login-main">
     <div class="layadmin-user-login-box layadmin-user-login-header">
       <h2>登录</h2>
       <!-- <p>用平台管理企业 从此信息交流如期简单</p> -->
     </div>
     <form id="loginForm" action="user" class="layadmin-user-login-box layadmin-user-login-body layui-form">
       <div class="layui-form-item">
         <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="LAY-user-login-username"></label>
         <input type="text" name="user_account" id="LAY-user-login-username" lay-verify="required" placeholder="用户名" class="layui-input">
       </div>
       <div class="layui-form-item">
         <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
         <input type="password" name="user_pass" id="LAY-user-login-password" lay-verify="required" placeholder="密码" class="layui-input">
       </div>
       <div class="layui-form-item">
		<input type="submit" name="" id="loginBtn" class="layui-btn layui-btn-fluid" value="登录" />
       </div>
       <div class="layui-form-item">
         <a href="regist.jsp" class="layui-btn layui-btn-fluid" lay-filter="LAY-user-login-submit">注 册</a>
       </div>
       
     </form>
   </div>
 </div>
</body>
</html>