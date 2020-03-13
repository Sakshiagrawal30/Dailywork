package com.cts;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/RequestHandlerServlet")
public class FirstFilter implements Filter {

   
    public FirstFilter() {

    }

	
	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String name1=request.getParameter("un");
		String name2=name1.toUpperCase();
		if(name1.equals(name2))
		{
			chain.doFilter(request, response);
		}
		else
		{
			response.getWriter().write("<h1>invalid username</h1>");
		}
		
//		
//		if(request.getParameter("un").equals)
//		{
//			chain.doFilter(request, response);
//		}
//		else
//		{
//			response.getWriter().write("<h1>invalid user</h1>");
//		}
//		

	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("from init of firstfilter");
	}

}
