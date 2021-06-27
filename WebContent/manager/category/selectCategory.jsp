<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.sql.*,com.test.util.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示分类列表的页面</title>
</head>
<style type="text/css">
body{
	background-image: url("css/Image/qVj-bWs3USw.jpg");
    background-size: cover;
}
table {
    border: 2px #CCCCCC solid;
    color: white;
    width: 80%;
    text-align:center;
}
td,th {
    height: 30px;
    border: #CCCCCC 1px solid;
}
div {
	color: #99CCFF;
	text-align: center;
}
</style>
<script>
function deleteRow(r)
{
var i=r.parentNode.parentNode.rowIndex;
document.getElementById('myTable').deleteRow(i);
}
</script>
<body>
	  <%
     	DBconn.dbConn();
        String sql = "select * from category";
        ResultSet rs = DBconn.selectSql(sql);
	  %>
	  <br>
	<div><h1>软件分类信息</h1></div><br><br>
	<table align=center width="600" border="1">
		<tr>
			<td>分类编号</td>
			<td>分类名称</td>
			<td>分类信息</td>
			<td>操作</td>
		</tr>
	<% 
		while (rs.next()){
	%>
			<tr>
				<td><%out.print(rs.getString("id")); %></td>
				<td><%out.print(rs.getString("name")); %></td>
				<td><%out.print(rs.getString("information")); %></td>
				<td><a href="#">修改</a><input type="button" value="删除" onclick="deleteRow(this)"></td>
			</tr>
	<%
		} 
	%>
	</table>
</body>
</html>

