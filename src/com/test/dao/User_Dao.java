package com.test.dao;

//import java.util.ArrayList;


import java.util.List;


import com.test.entity.User;


public interface User_Dao {
	public boolean login(String username, String password);
	public boolean adminLogin(String id, String password);
	public boolean register(User user);
	public List<User> getUserAll();
	public boolean delete(String username);
	public boolean update(String username, String password);
}
