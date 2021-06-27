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
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
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
		 String password = request.getParameter("password");
		 //调用UserDao中的getSelect方法并获取到返回值
		 //UserDao userDao=new UserDao();
		 //boolean flag = userDao.login(username, password);
		 User_Dao ud = new UserDaoImpl();
		 boolean flag = ud.adminLogin(id, password);
		 System.out.println("----------------------------------");
		 //若用户名和密码存在则转发到index.jsp页面，否则重定向到error.jsp页面
		 //HttpSession session = request.getSession();
		 if (flag) {
			 //session.setAttribute("success", "<script>alert('登陆成功')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("manager.jsp");
			rd.forward(request, response);	
		 	}
		 else {
		  response.sendRedirect("error.jsp");
			}
		doGet(request, response);
	}

}
