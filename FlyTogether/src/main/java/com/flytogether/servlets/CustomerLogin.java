package com.flytogether.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/CustomerLogin")
public class CustomerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource( name = "jdbc/mydb")
	private DataSource datasource ;
    private CustomerUtils userDataUtil;
    
    private PreparedStatement preparedstmt;
    
    public CustomerLogin() {
        super();
        
    }
    public void init(ServletConfig config) throws ServletException {
		try {
			
			userDataUtil = new CustomerUtils(datasource);
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		boolean r =userDataUtil.values(username,password);
		System.out.println("r="+r);
		if(r) {
			
		request.setAttribute("users_list", userDataUtil.getCustomer());
		RequestDispatcher rd = request.getRequestDispatcher("BookingPage.jsp");
		rd.forward(request, response);
		
		}else {
			
			RequestDispatcher rd = request.getRequestDispatcher("CustomerLogin.jsp");
			rd.include(request, response);
			out.println("<p> Customer not found</p>");

		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}