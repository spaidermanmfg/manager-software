package com.test.impl;

import java.sql.ResultSet;




import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.dao.User_Dao;
import com.test.entity.User;
import com.test.util.DBconn;


public class UserDaoImpl implements User_Dao{
	public boolean login(String username, String password) {
		boolean flag = false;
		try {
			DBconn.dbConn();
			String sql = "select * from user where username='"+username+"' and password='"+password+"'";
			ResultSet rs = DBconn.selectSql(sql);
			if(rs.next()) {
				flag = true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;	
	}
	public boolean adminLogin(String id, String password) {
		boolean flag = false;
		try {
			DBconn.dbConn();
			String sql = "select * from admin where id='"+id+"' and password='"+password+"'";
			ResultSet rs = DBconn.selectSql(sql);
			if(rs.next()) {
				flag = true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	public boolean register(User user) {
		boolean flag = false;
		try {
			DBconn.dbConn();
			String sql = "insert into user(username, password) values('"+user.getUserName()+"', '"+user.getPassword()+"')";
			int i = DBconn.addUpdDel(sql);
			if (i > 0) {
				flag = true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public List<User> getUserAll() {
		List<User> list = new ArrayList<User>();
		try {
			DBconn.dbConn();
			String sql = "select * from user";
			ResultSet rs = DBconn.selectSql(sql);
			while (rs.next()) {
				//User user = new User();
				//user.setUserName(rs.getString("username"));
				//user.setPassword(rs.getString("password"));
				//list.add(user);
				String username = rs.getString("username");
				String password = rs.getString("password");
				
				User user = new User();
				user.setUserName(username);
				user.setPassword(password);
				list.add(user);
			}
		}catch(Exception e) {
			System.out.println("数据库查找失败");
			e.printStackTrace();
		}
		/*catch(SQLException e) {
			System.out.println("数据库连接失败");
			e.printStackTrace();
		}
		 */
		return list;
	}
	public boolean delete(String username) {
		boolean flag = false;
		try {
			DBconn.dbConn();
			String sql = "delete from user where username ="+username;
			int i = DBconn.addUpdDel(sql);
			if (i > 0) {
				flag = true;
				System.out.println("删除成功");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public boolean update(String username, String password) {
		boolean flag = false;
		try {
			DBconn.dbConn();
			String sql= "update user set password = '"+password+"' where username = "+username;
			int i = DBconn.addUpdDel(sql);
			if (i > 0) {
				flag = true;
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
