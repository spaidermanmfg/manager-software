<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
<link href="css/Login.css" rel="stylesheet" />
</head>
<style type="text/css">
 	 	/*主体部分样式*/
		html,body {
    		margin: 0;
    		padding: 0;
   			font-family: sans-serif;
    		background-image: url("css/Image/截屏2021-06-17 12.30.39.png");
    		background-size: cover;
    		background-color: black;
	}
	</style>
<body> 
	<form class="login-box" action="RegisterServlet" method="post">	
	
		<div class="textbox">
		<i class="fa fa-user" aria-hidden="true"></i>
		<input type="text" placeholder="请输入账号" name="username" /><br/>
		</div>
		
		<div class="textbox">
		<i class="fa fa-lock" aria-hidden="true"></i>
		<input type="text" placeholder="请输入密码" name="password" /><br/>
		</div>
		<button class="btn" type="submit" name="register">添加</button>
		<button class="btn" type="reset" name="reset">重置</button>	
	</form>
 
</body>
</html>