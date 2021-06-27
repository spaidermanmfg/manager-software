<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="css/Login.css" rel="stylesheet" />
<body>
		<form class="login-box" action="DeleteSoftwareServlet" method="post">
		<div class="textbox">
			<i class="fa fa-user" aria-hidden="true"></i>
			<input type="text" name="id" placeholder="请输入类别编号">
		</div>
			<button class="btn" type="submit" name="delete">删除</button>
			<button class="btn" type="reset" name="reset">重置</button>
		</form>
</body>
</html>