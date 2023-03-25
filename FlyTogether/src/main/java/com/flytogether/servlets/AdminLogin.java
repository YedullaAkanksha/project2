package com.flytogether.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource( name = "jdbc/mydb")
	private DataSource datasource ;
    private AdminUtils adminDataUtil;
    
    private PreparedStatement preparedstmt;
    
    public AdminLogin() {
        super();
     
    }
    public void init(ServletConfig config) throws ServletException {
		try {
			
			adminDataUtil = new AdminUtils(datasource);
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		boolean r =adminDataUtil.values(username,password);
		//System.out.println("r="+r);
		if(r) {
			request.setAttribute("admins_list", adminDataUtil.getAdmin());

		RequestDispatcher rd = request.getRequestDispatcher("ResetPassword.jsp");
		rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("AdminLogin.jsp");
			rd.include(request, response);
			out.println("<p> Admin not found</p>");				

		}
		
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		}
	private boolean isValidInput(String username, boolean b) {
		if(username == null || username.isEmpty()) {
			return false;
		}
		return true;
	
	}

}