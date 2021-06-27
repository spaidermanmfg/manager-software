<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*, com.test.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>用户信息</title>
</head>
<style type="text/css">

 	 	/*主体部分样式*/
html,body {
    background-image: url("css/Image/截屏2021-06-17 12.30.39.png");
    background-size: cover;
	}
	
table {
	margin-top: 6%;
    border: 2px #CCCCCC solid;
    color: black;
    width: 360px;
    text-align:center;
}

td,th {
    height: 30px;
    border: #CCCCCC 1px solid;
}
div {
	color: #666666;
}
</style>
<script>
function deleteRow(r)
{
var i=r.parentNode.parentNode.rowIndex;
document.getElementById('myTable').deleteRow(i);
}
</script>

<body > 
	  <%
     	DBconn.dbConn();
        String sql = "select * from user";
        ResultSet rs = DBconn.selectSql(sql);
	  %>
	  <br><br><br><br><br>
	  <table align=center width="600" border="1" id="myTable">
   	 	<tr>
       	 	<th>账号</th>
       	 	<th>密码</th>
       	 	<th>删除</th>
       	 	<th>更新</th>
   	 	</tr>
    	<!-- <c:forEach var="U" items="${list}"> </c:forEach>-->
    	<%
    	 while (rs.next()) {  
    	%>
            <tr>
                <td><%out.print(rs.getString("username")); %></td>
                <td><%out.print(rs.getString("password")); %></td>
                <td><input type="button" value="删除" onclick="deleteRow(this)"></td>
                <td><input type="submit" value="更新"></td>
            </tr>
    	<%
    	} 
    	%>
	</table>
	<div align="center">
        
        <h2>数据查询成功(⁎⁍̴̛ᴗ⁍̴̛⁎)</h2>
    </div>
</body>
</html>


