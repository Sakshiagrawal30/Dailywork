package com.ctstrainingjdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//1. load the database driver 
		//1.1 by using forName()
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//1.2 
       //Driver driver=new com.mysql.jdbc.Driver();

//2.establish the connection
		String url="jdbc:mysql://localhost:3306/ctspune";
Connection con=DriverManager.getConnection(url,"root", "root")	;	
//	System.out.println(con.getClass().getName());

//3.execute sql queries
	Statement st=con.createStatement();
//	String query="insert into employee values(4,'sakshi','pune',22,9876544456),(2,'harshita','pune',21,9886655645),(3,'disha','indore',22,98765655444)";
//String query="update employee set name='shakti' where id=4";
	//String query="delete from employee where id=2";
	String query="select * from employee";
ResultSet rs=	st.executeQuery(query);
	//int result=st.executeUpdate(query);
	while(rs.next())
	{
		int id=rs.getInt(1);
		String name=rs.getString(2);
		String address=rs.getString(3);
		int age=rs.getInt(4);
		long phone=rs.getLong(5);
		System.out.println(id+":"+name+":"+address+":"+age+":"+phone);
		
	}
	
//	if(result>0)
//	{
//		System.out.println("record deleted successfully");
//	}
//	else
//	{
//		System.out.println("something went wrong");
//	}
	}

}
