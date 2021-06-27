<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.sql.*,com.test.util.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>教育</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
  <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <style>
  	body {
  		background-image: url("Reflection 3.jpg");
  		background-size: cover;
  	}
  	h1 {
  		margin-top: 3%;
  		margin-bottom: 3%;
  		margin-left: 6%;
  		color: white;
  	}
  	h3 {
  		color: white;
  	}
  	
  
  </style> 
</head>
<body>
<%
	DBconn.dbConn();
	String sql = "select * from software where category='教育'";
	ResultSet rs = DBconn.selectSql(sql);
%>
<h1>教育</h1>
<hr>
<div class="container">
  <br>
  <h3>好好学习，天天学习</h3> 
  <br>          
  <table class="table table-dark table-hover">
    <thead>
      <tr>
       	<th>软件编号</th>
		<th>软件名称</th>
		<th>软件开发者</th>
		<th>软件价格</th>			
		<th>软件大小</th>
		<th>软件类型</th>
		<th>软件下载</th>
      </tr>
    </thead>
    <%
    	while(rs.next()) {
    %>
    <tbody>
      <tr>
        <td><%out.print(rs.getString("id"));%></td>
		<td><%out.print(rs.getString("name"));%></td>
		<td><%out.print(rs.getString("developer"));%></td>
		<td><%out.print(rs.getString("price"));%></td>
		<td><%out.print(rs.getString("size"));%></td>			
		<td><%out.print(rs.getString("category"));%></td>
		<th>下载</th>
      </tr>
    </tbody>
    <%
    	}
    %>
  </table>
</div>

</body>
</html>