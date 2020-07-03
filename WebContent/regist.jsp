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
        <h2>注册</h2>
      </div>
      <form action="user" id="userForm" method="post" class="layadmin-user-login-box layadmin-user-login-body layui-form">
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
          <input type="text" name="user_name" id="LAY-user-login-password" lay-verify="pass" placeholder="用户名" class="layui-input">
        </div>
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-cellphone" for="LAY-user-login-cellphone"></label>
          <input type="text" name="user_account" id="LAY-user-login-cellphone" lay-verify="required" placeholder="账号" class="layui-input">
        </div>
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
          <input type="password" name="user_pass" id="LAY-user-login-password" lay-verify="pass" placeholder="密码" class="layui-input">
        </div>
       <div class="layui-form-item">
		<input type="submit" name="" id="loginBtn" class="layui-btn layui-btn-fluid" value="注 册" />
       </div>
        <div class="layui-form-item">
          <a href="login.jsp" class="layui-btn layui-btn-fluid" lay-filter="LAY-user-reg-submit">登 录</a>
        </div>
      </form>
    </div>

  </div>
</body>
</html>