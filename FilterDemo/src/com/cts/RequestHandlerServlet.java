package com.cts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHandlerServlet
 */
@WebServlet("/RequestHandlerServlet")
public class RequestHandlerServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		
		System.out.println("welcome to RequestHandlerServlet");
		resp.getWriter().write("<h1>welcome to cts</h1>");
		
	}
}
    