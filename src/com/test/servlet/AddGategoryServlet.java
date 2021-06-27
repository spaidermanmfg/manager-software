package com.test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.Category_Dao;
import com.test.entity.Category;
import com.test.impl.CategoryDaoImpl;

/**
 * Servlet implementation class AddGategoryServlet
 */
@WebServlet("/manager/category/AddGategoryServlet")
public class AddGategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGategoryServlet() {
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
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String information = request.getParameter("infromation");
		
		Category cate = new Category();
		cate.setId(id);
		cate.setName(name);
		cate.setInformation(information);
		Category_Dao cd = new CategoryDaoImpl();
		boolean flag = cd.addCategory(cate);
		if (flag) {
			RequestDispatcher rd = request.getRequestDispatcher("/manager/tip/addTip.jsp");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("/manager/tip/error.jsp");
		}

		doGet(request, response);
	}

}
