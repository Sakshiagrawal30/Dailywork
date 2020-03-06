package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

System.out.println("from doGet of SourceServlet ");
String custName=req.getParameter("customername");
int term=Integer.parseInt(req.getParameter("term"));
int premiumamount=Integer.parseInt(req.getParameter("premium"));

req.setAttribute("customerName", custName);
req.setAttribute("noofyears", term);
req.setAttribute("amount", premiumamount);
System.out.println("your paid amount="+(premiumamount*term));
PrintWriter pw=resp.getWriter();
pw.write("<h1>Your paid amount &nbsp;&nbsp;"+(premiumamount*term)+"<h1>");

resp.sendRedirect("http://localhost:8080/WebApp1/login.html");

//RequestDispatcher dispatcher=req.getRequestDispatcher("http://localhost:8080/WebApp1/login.html");
//dispatcher.include(req, resp);
}
	
	
}
