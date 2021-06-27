package com.test.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.Category_Dao;
import com.test.entity.Category;
import com.test.impl.CategoryDaoImpl;

/**
 * Servlet implementation class SelectCategoryServlet
 */
@WebServlet("/manager/category/SelectCategoryServlet")
public class SelectCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectCategoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Category_Dao cd = new CategoryDaoImpl();
		List<Category> list = cd.selectCategory();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/manager/category/selectCategory.jsp").forward(request, response);

		doGet(request, response);
	}

}
