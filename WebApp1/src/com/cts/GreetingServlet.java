package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter pw= resp.getWriter();
		String username=req.getParameter("un");
		String password=req.getParameter("pwd");
if(password.equals("pwd"))
{
		
		System.out.println("welcome"+username);
	pw.write("<h1>welcome"+username+"</h1>");
	
	//pw.write("<h1>welcome"+password+"</h1>");
	
	
	}
else
{pw.write("<h1>wrong input</h1>");
	}

	}
}
