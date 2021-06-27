<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
<title>left</title>
 <style type="text/css">
 	  body{
 	  	background-image: url("css/Image/截屏2021-06-17 11.32.39.png");

 	  }
 	  div {
 	  	margin-top: 20%;
 	  	margin-left: 4%;
 	  	color: white;
 	  }
 	   li {
 	  	  	list-style-type:none;
 	  	  }
      .dc { 
      		display: none; 
      		margin-left: 10px;
      	  }
      a {
		text-decoration:none;
		cursor:default;
		color: white;
		}
	</style>
	<script>
	      function test(e) {
	    	  	var div = document.getElementById(e);
	            div.style.display = div.style.display == 'block' ? 'none' : 'block' ;       
	      }
	</script>
</head>
<body>
<br><br>
	<div>
	<ul>
		<li>
		<div onclick="test('div4')">用户管理
			<object class="dc" id="div4">
				<a href="registers.jsp" target="right">添加用户信息</a><br/>
				<a href="delete.jsp" target="right">删除用户信息</a><br/>
				<a href="showAll.jsp" target="right">查看用户信息</a><br/>
				<a href="update.jsp" target="right">修改用户信息</a><br/>
			</object>
		</div>
		<br>
		<br>
		</li>
		
		
		<li>
		<div onclick="test('div1')">分类管理
			<object class="dc" id="div1">
				<a href="category/addCategory.jsp" target="right">添加分类信息</a><br/>
				<a href="category/deleteCategory.jsp" target="right">删除分类信息</a><br/>
				<a href="category/updateCategory.jsp" target="right">修改分类信息</a><br/>
				<a href="category/selectCategory.jsp" target="right">查看分类信息</a><br/>
			</object>
		</div>
		<br>
		<br>
		</li>
		
		
		<li>
		<div onclick="test('div2')">软件管理
			<object class="dc" id="div2">
				<a href="software/addSoftware.jsp" target="right">添加软件</a><br/>
				<a href="software/deleteSoftware.jsp" target="right">删除软件</a><br/>
				<a href="software/selectSoftware.jsp" target="right">查看产品</a><br/>
			</object>
		</div>
		<br>
		<br>
		</li>
		
		
		
		<li>
		<div onclick="test('div3')">下载管理
			<object class="dc" id="div3">
				<a href="#" target="right">已下载软件</a><br/>
				<a href="#" target="right">待下载软件</a><br/>
			</object>
		</div>
		</li>
		
	</ul>
	</div>
</body>
</html>