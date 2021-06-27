package com.test.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.User_Dao;
import com.test.entity.User;
import com.test.impl.UserDaoImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/manager/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		String password = request.getParameter("password");
		
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		
		User_Dao ud = new UserDaoImpl();
		boolean flag = ud.register(user);
		
		if(flag) {
			RequestDispatcher rd = request.getRequestDispatcher("/manager/tip/addTip.jsp");
			rd.forward(request, response);	
		}
		else {
			response.sendRedirect("error.jsp");
			
		}
		doGet(request, response);
	}

}
