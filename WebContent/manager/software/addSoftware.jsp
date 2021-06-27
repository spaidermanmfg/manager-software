<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加软件</title>
</head>
<link href="css/Login.css" rel="stylesheet" />
<style type="text/css">
	form {
		margin-top: 6%;
	}
	div {
		color: black;	
	}
</style>
<body>
	<form class="login-box" action="AddSoftwareServlet" method="post">
		<div class="textbox">
			<input type="text" name="id" placeholder="请输入软件编号">
		</div>
		<div class="textbox">
			<input type="text" name="name" placeholder="请输入软件名称">
		</div>
		<div class="textbox">
			<input type="text" name="developer" placeholder="请输入软件开发者">
		</div>
		<div>
			<input type="radio" name="price" value="免费" checked>免费
			<input type="radio" name="price" value="付费">付费
		</div>
		<div class="textbox">
			<input type="text" name="size" placeholder="请输入软件大小">
		</div>
		<div>
			<select name="category">
				<option value="社交">社交</option>
				<option value="旅游">旅游</option>
				<option value="教育">教育</option>
				<option value="新闻">新闻</option>
				<option value="游戏">游戏</option>
				<option value="音乐">音乐</option>
				<option value="医疗">医疗</option>	
			</select>
		</div>
		
		<button class="btn" type="submit" name="add">添加</button>
		<button class="btn" type="reset" name="reset">重置</button>
	</form>
</body>
</html>