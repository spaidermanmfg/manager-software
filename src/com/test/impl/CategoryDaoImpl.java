package com.test.impl;

import java.sql.*;
import java.util.ArrayList;

import java.util.List;

import com.test.dao.Category_Dao;
import com.test.entity.Category;
import com.test.util.DBconn;

public class CategoryDaoImpl implements Category_Dao{
	public boolean addCategory(Category cate) {
		boolean flag = false;
		try {
			DBconn.dbConn();
			String sql = "insert into category(id, name, information) values('"+cate.getId()+"', '"+cate.getName()+"', '"+cate.getInformation()+"')";
			int i = DBconn.addUpdDel(sql);
			if (i > 0) {
				flag = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public boolean deleteCategory(String id) {
		boolean flag = false;
		try {
			DBconn.dbConn();
			String sql =  "delete from category where id ="+id;
			int i = DBconn.addUpdDel(sql);
			if (i > 0) {
				flag = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean updateCategory(String id, String name, String information) { 
		boolean flag = false;
		try {
			DBconn.dbConn();
			String sql = "update category set name = '"+name+"', information = '"+information+"' where id = "+id;
			int i = DBconn.addUpdDel(sql);
			if (i > 0) {
				flag = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public List<Category> selectCategory(){
		List<Category> list = new ArrayList<Category>();
		try {
			DBconn.dbConn();
			String sql = "select * from category";
			ResultSet rs = DBconn.selectSql(sql);
			while (rs.next()) {
				Category cate = new Category();
				cate.setId(rs.getString("id"));
				cate.setName(rs.getString("name"));
				cate.setInformation(rs.getString("information"));
				list.add(cate);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}
 		return list;
	}
}
