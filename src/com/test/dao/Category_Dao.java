package com.test.dao;

import java.util.List;



import com.test.entity.Category;

public interface Category_Dao {
	public boolean addCategory(Category cate);
	public boolean deleteCategory(String id);
	public boolean updateCategory(String id, String name, String information);
	public List<Category> selectCategory();
}
