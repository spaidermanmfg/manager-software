<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>普通用户登陆</title>
<link href="css/Login.css" rel="stylesheet" />
<style>
	.btg{
		 width: 100%;
    background: none;
    box-sizing:border-box;
    -moz-box-sizing:border-box;
    width: 49%;
    border: 2px solid gray;
    color: white;
    padding: 5px;
    font-size: 12px;
    cursor: pointer;
    margin: 12px 0;
    max-width: 78px
	}

</style>
</head>
<body style="text-algin: center">
	<form class="login-box" action="LoginServlet" method="post">
		<div class="textbox">
		<i class="fa fa-user" aria-hidden="true"></i>
		<input type="text" placeholder="请输入用户账号" name="username" /><br/>
		</div>
		
		<div class="textbox">
		<i class="fa fa-lock" aria-hidden="true"></i>
		<input type="password" placeholder="请输入用户密码" name="password" /><br/>
		</div>
		<button class="btn" type="submit" name="login">登陆</button>	
		<button class="btn" type="reset" name="resit">重置</button>	
		
	</form>	
	<a href="manager/registers.jsp"><button class="btg" type="submit" name="register">注册</button></a>
	<a href="adminlogin.jsp"><button class="btg" type="submit" name="register">管理员登陆</button></a>
</body>
</html>