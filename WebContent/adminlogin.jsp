<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员登陆</title>
<link href="css/Login.css" rel="stylesheet" />

</head>
<body class="body" style="text-algin: center">
	<form class="login-box" action="AdminLoginServlet" method="post">	
	
		<div class="textbox">
		<i class="fa fa-user" aria-hidden="true"></i>
		<input type="text" placeholder="请输入管理员账号" name="id" /><br/>
		</div>
		
		<div class="textbox">
		<i class="fa fa-lock" aria-hidden="true"></i>
		<input type="password" placeholder="请输入管理员密码" name="password" /><br/>
		</div>
		<button class="btn" type="submit" name="login">登陆</button>	
		<button class="btn" type="submit" name="register">注册</button>	
	</form>
	
		
</body>
</html>