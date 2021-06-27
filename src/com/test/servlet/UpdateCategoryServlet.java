package com.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.Category_Dao;
import com.test.impl.CategoryDaoImpl;

/**
 * Servlet implementation class UpdateCategoryServlet
 */
@WebServlet("/manager/category/UpdateCategoryServlet")
public class UpdateCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCategoryServlet() {
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
		String name = request.getParameter("name");
		String information = request.getParameter("information");
		String id = request.getParameter("id");
		
		Category_Dao cd = new CategoryDaoImpl();
		boolean flag = cd.updateCategory(id, name, information);
		
		if (flag) {
			request.getRequestDispatcher("/manager/tip/updateTip.jsp").forward(request, response);
		}else {
			response.sendRedirect("/manager/tip/error.jsp");
		}
		doGet(request, response);
	}

}
