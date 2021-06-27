package com.test.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.User_Dao;
import com.test.impl.UserDaoImpl;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/manager/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
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
		String username = request.getParameter("username");
		//int userName = Integer.parseInt(username);
		
		User_Dao ud = new UserDaoImpl();
		boolean flag = ud.delete(username);
		System.out.println("--------------------");
		if (flag) {
			RequestDispatcher rd = request.getRequestDispatcher("/manager/tip/deleteTip.jsp");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("error.jsp");
		}
		doGet(request, response);
	}

}
