package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.Software_Dao;
import com.test.entity.Software;
import com.test.impl.SoftwareDaoImpl;

/**
 * Servlet implementation class AddSoftwareServlet
 */
@WebServlet("/manager/software/AddSoftwareServlet")
public class AddSoftwareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSoftwareServlet() {
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
		request.setCharacterEncoding("utf8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String developer = request.getParameter("developer");
		String price = request.getParameter("price");
		String size = request.getParameter("size");
		String category = request.getParameter("category");
		
		
		
		Software soft = new Software();
		soft.setId(id);
		soft.setName(name);
		soft.setDeveloper(developer);
		soft.setPrice(price);
		soft.setSize(size);
		soft.setCategory(category);
		
		
		Software_Dao sd = new SoftwareDaoImpl();
		boolean flag = sd.addSoftware(soft);
		if (flag) {
			request.getRequestDispatcher("/manager/tip/addTip.jsp").forward(request, response);
			
		}else {
			response.sendRedirect("/manager/tip/error.jsp");
		}
			
		doGet(request, response);
	}

}
