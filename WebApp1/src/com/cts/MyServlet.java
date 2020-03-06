package com.cts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sakshiA")
public class MyServlet extends HttpServlet{
	
@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	System.out.println("From init ===it gets called only once----always");
}
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		System.out.println("From service ===it gets called only once----always");

		}
	@Override
		public void destroy() {
			// TODO Auto-generated method stub
		System.out.println("From destroy ===it gets called only once----always");

		}
	
}
