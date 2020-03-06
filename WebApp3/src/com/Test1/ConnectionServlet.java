package com.Test1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectionServlet extends HttpServlet {
	String user, password, url, driver, email, salary;
	Connection con;

	@Override

	public void init(ServletConfig config) throws ServletException {

		user = config.getInitParameter("userName");
		password = config.getInitParameter("password");

		url = config.getInitParameter("url");
		driver = config.getInitParameter("driver");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
//			System.out.println(con);


		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String name = req.getParameter("username");
		String pass = req.getParameter("pass");
		String emailid = req.getParameter("id");
		String salary = req.getParameter("salary");

		try {
			PreparedStatement st;
			st = con.prepareStatement("insert into user values(?,?,?,?)");
			st.setString(1, req.getParameter("username"));
			st.setString(2, req.getParameter("pass"));
			st.setString(3, req.getParameter("id"));
			st.setString(4, req.getParameter("salary"));
			st.executeUpdate();
			st.close();
			con.close();
			pw.println("<html><body><b>Successfully Inserted" + "</b></body></html>");

		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}
}
