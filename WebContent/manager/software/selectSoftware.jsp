<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.sql.*,com.test.util.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Insert title here</title>
</head>
<style type="text/css">
table {
    border: 2px #CCCCCC solid;
    color: black;
    width: 80%;
    text-align:center;
}
td,th {
    height: 30px;
    border: #CCCCCC 1px solid;
}
div {
	color: #666666;
	text-align: center;
}
</style>
<body style="background: #999999">
	<% 
		DBconn.dbConn();
		String sql = "select * from software";
		ResultSet rs = DBconn.selectSql(sql);
	%>
	<br><br>
	<div><h1>软件信息</h1></div><br>
	<table align=center width="600" border="1">
		<tr>
			<th>软件编号</th>
			<th>软件名称</th>
			<th>软件开发者</th>
			<th>软件价格</th>
			<th>软件大小</th>
			<th>软件类型</th>
		</tr>
		<%
			while(rs.next()) {
		%>
		<tr>
			<td><%out.print(rs.getString("id"));%></td>
			<td><%out.print(rs.getString("name"));%></td>
			<td><%out.print(rs.getString("developer"));%></td>
			<td><%out.print(rs.getString("price"));%></td>
			<td><%out.print(rs.getString("size"));%></td>
			<td><%out.print(rs.getString("category"));%></td>
		</tr>
		<%
			}
		%>
	
	
	</table>

</body>
</html>