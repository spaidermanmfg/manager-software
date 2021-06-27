package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.test.dao.Category_Dao;
import com.test.dao.Software_Dao;
//import com.test.impl.CategoryDaoImpl;
import com.test.impl.SoftwareDaoImpl;

/**
 * Servlet implementation class DeleteSoftwareServlet
 */
@WebServlet("/manager/software/DeleteSoftwareServlet")
public class DeleteSoftwareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSoftwareServlet() {
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
		
		Software_Dao sd = new SoftwareDaoImpl();
		boolean flag = sd.deleteSoftware(id);
		
		if (flag) {
			request.getRequestDispatcher("/manager/tip/deleteTip.jsp").forward(request, response);
		}else {
			response.sendRedirect("/manager/tip/error.jsp");
		}
		doGet(request, response);
	}

}
