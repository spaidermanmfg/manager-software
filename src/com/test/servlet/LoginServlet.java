package com.test.servlet;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

//import com.test.dao.UserDao;
import com.test.dao.User_Dao;
import com.test.impl.UserDaoImpl;
//创建时为Servlet而不是Class，需要在web.xml中进行配置，配置的代码Myeclipse将自动生成
public class LoginServlet extends HttpServlet {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//创建UserDao的对象，以便于查询数据库

 //以下doGet方法和doPost方法分别对应form表单中的method="get"和method="post"
 public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
 }
 public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
 //利用getParameter方法获取到前台文本框中输入的值，其中括号内的内容为<input/>标签中的name属性
 String username=request.getParameter("username");
 String password=request.getParameter("password");
 //调用UserDao中的getSelect方法并获取到返回值
 //UserDao userDao=new UserDao();
 //boolean flag = userDao.login(username, password);
 User_Dao ud = new UserDaoImpl();
 boolean flag = ud.login(username, password);
 //若用户名和密码存在则转发到index.jsp页面，否则重定向到error.jsp页面
 //HttpSession session = request.getSession();
 if (flag) {
	 //session.setAttribute("success", "<script>alert('登陆成功')</script>");
	RequestDispatcher rd = request.getRequestDispatcher("client.jsp");
	rd.forward(request, response);	
 	}
 else {
  response.sendRedirect("error.jsp");
	}

 	}
 }

