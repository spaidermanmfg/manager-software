package com.test.impl;

import com.test.dao.Software_Dao;
import com.test.entity.Software;
import com.test.util.DBconn;

public class SoftwareDaoImpl implements Software_Dao {
	public boolean addSoftware(Software soft){
		boolean flag = false;
		try {
			DBconn.dbConn();
			String sql = "insert into software(id, name, developer, price, size, category) values('"+soft.getId()+"', "
					+ "'"+soft.getName()+"', "
							+ "'"+soft.getDeveloper()+"', "
									+ "'"+soft.getPrice()+"', "
											+ "'"+soft.getSize()+"', "
													+ "'"+soft.getCategory()+"')";
															
			int i = DBconn.addUpdDel(sql);
			if (i > 0) {
				flag = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}//增加
	public boolean deleteSoftware(String id){
		boolean flag = false;
		try {
			DBconn.dbConn();
			String sql = "delete from software where id ="+id;
			int i = DBconn.addUpdDel(sql);
			if (i > 0) {
				flag = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}//删除
	public boolean updateSoftware(){
		boolean flag = false;
		return flag;
	}//修改
}
