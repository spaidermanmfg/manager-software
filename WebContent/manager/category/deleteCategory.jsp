<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>删除类别</title>
</head>
<link href="css/Login.css" rel="stylesheet" />
<style type="text/css">
 	 	/*主体部分样式*/
		html,body {
    		margin: 0;
    		padding: 0;
   			font-family: sans-serif;
    		background-image: url("css/Image/qVj-bWs3USw.jpg");
    		background-size: cover;
    		background-color: black;
	}
	</style>
<body>
	<form class="login-box" action="DeleteCategoryServlet" method="post">
		<div class="textbox">
			<input type="text" name="id" placeholder="请输入类别编号">
		</div>
			<button class="btn" type="submit" name="delete">删除</button>
			<button class="btn" type="reset" name="reset">重置</button>
	</form>
</body>
</html>