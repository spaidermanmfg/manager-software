package com.test.util;
 
import java.sql.*;
 
public class DBconn {
	static String url =  "jdbc:mysql://localhost:3306/student?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC"; 
	static String username = "root";
	static String password = "123456";
	static String driver = "com.mysql.cj.jdbc.Driver";
	static Connection conn = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	//数据库连接
	public static void dbConn() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//增删更新
	public static int addUpdDel(String sql) {
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			i = ps.executeUpdate(sql);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	//查询
	public static ResultSet selectSql(String sql){
		try {
			ps =  conn.prepareStatement(sql);
			rs =  ps.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("sql数据库查询异常");
			e.printStackTrace();
		}
		return rs;
	}
	public static void closeConn() {
		try {
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}	
}

