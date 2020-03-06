package com.Test1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
//System.out.println("from init");
try {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/ctspune";
	Connection con=DriverManager.getConnection(url,"root", "root")	;
	System.out.println("connection established");


Statement st=con.createStatement();

} catch (ClassNotFoundException e) {

	e.printStackTrace();
}
catch (Exception e) {

	e.printStackTrace();
}	


	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("from service");
	if(req.getMethod().equals("GET"))
	{
		doGet(req, resp);
	}
	else
	{
	doPost(req,resp);
	}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from doPost");
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("from doGet");
	
	}

}
