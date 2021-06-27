<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
<meta charset="UTF-8">
<title>前台</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<style>
		 body{
 	  		background-image: url("Image/截屏2021-06-17 13.28.37.png");
 	  		background-size: cover;
 	  	}
 	  	 div {
 	  		margin-top: 15%;
 	  		margin-left: 10%;
 	  		color: white;
 	  	}
 	  	 li {
 	  	  	list-style-type:none;
 	  	  }
 	  
		a {
			font-size: 20px;
			text-decoration:none;
			cursor:default;
			color: white;
		}
</style>
<body>
	<div class="container"> 
      	 <input type="email" class="form-control" id="search" placeholder="搜索">
    </div>
	<div>
		<div>
			<ul>
				<li>
					<i class="fa fa-comments" style="font-size:24px"></i>
					<a href="software_category/social.jsp" target="right">社交</a>
					<br><br>
				</li>
				<li>
					<i class="fa fa-camera-retro" style="font-size:24px"></i>
					<a href="software_category/travel.jsp" target="right">旅游</a>
					<br><br>
				</li>
				<li>
					<i class="fa fa-graduation-cap" style="font-size:20px"></i>
					<a href="software_category/education.jsp" target="right">教育</a>
					<br><br>
				</li>
				<li>
					<i class="fa fa-paper-plane" style="font-size:24px"></i>
					<a href="software_category/news.jsp" target="right">新闻</a>
					<br><br>
				</li>
				<li>
					<i class="fa fa-rocket" style="font-size:24px"></i>
					<a href="software_category/games.jsp" target="right">游戏</a>
					<br><br>
				</li>
				<li>
					<i class="fa fa-music" style="font-size:24px"></i>
					<a href="software_category/music.jsp" target="right">音乐</a>
					<br><br>
				</li>
				<li>
					<i class="fa fa-heartbeat" style="font-size:21px"></i>
					<a href="software_category/medical.jsp" target="right">医疗</a>
					<br><br>
				</li>
			</ul>
		</div>	
	</div>
</body>
</html>