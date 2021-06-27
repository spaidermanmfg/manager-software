package com.test.dao;

import com.test.entity.Software;

public interface Software_Dao {
	public boolean addSoftware(Software software);//增加
	public boolean deleteSoftware(String id);//删除
	public boolean updateSoftware();//修改
}
