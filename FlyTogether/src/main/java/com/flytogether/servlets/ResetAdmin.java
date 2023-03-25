package com.flytogether.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/ResetAdmin")
public class ResetAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/mydb")
	private DataSource datasource;
  
	private AdminUtils adminDataUtil;
       

	public void init(ServletConfig config) throws ServletException {
		// To Create connection
		try {
			
			adminDataUtil = new AdminUtils(datasource);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
    public ResetAdmin() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String  password= request.getParameter("password");
		
		adminDataUtil.ResetAdmin(username, password);	
		
//		request.setAttribute("admins_list", adminDataUtil.getAdmin());
//		RequestDispatcher dispatcher = request.getRequestDispatcher("AdminList.jsp");
//		dispatcher.forward(request, response);
		PrintWriter out = response.getWriter();
		
		out.println("<p><b>Password Updated..!!</b>"+"</p>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}