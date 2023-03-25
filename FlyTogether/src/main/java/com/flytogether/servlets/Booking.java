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

@WebServlet("/Booking")
public class Booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource( name = "jdbc/mydb")
	private DataSource datasource ;
    private CustomerUtils userDataUtil;
    
    private PreparedStatement preparedstmt;
    
    public Booking() {
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
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.setAttribute("flight_list", userDataUtil.getAtHandFlights(source, destination));
		RequestDispatcher rd = request.getRequestDispatcher("AtHandFlights.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}