package com.ctstrainingjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/ctspune";
	
	
	Connection con=DriverManager.getConnection(url,"root", "root")	;	
	Statement st=con.createStatement();
//	String query11="create table student1(rollno int primary key,name varchar(50),address varchar(50),age int )";
//int  res=st.executeUpdate(query11);
//	String query1="insert into student1 values(105,'sakshi','pune',22),(102,'harshita','pune',21),(103,'disha','indore',22)";
//	int result1=st.executeUpdate(query1);
//String query2="update student set name='shakti' where rollno=105";
//	int result2=st.executeUpdate(query2);
	String query5="delete from employee where id=103";
	int  res=st.executeUpdate(query5);
String query="select * from employee";
	ResultSet rs=	st.executeQuery(query);
	while(rs.next())
	{
		int rollno=rs.getInt(1);
		String name=rs.getString(2);
		String address=rs.getString(3);
		int age=rs.getInt(4);

		System.out.println(rollno+":"+name+":"+address+":"+age+":");
		
	}
//	if(result2>0)
//		{
//		
//		{
//			
//		}
//			System.out.println("record updated successfully");
//		}
//		else
//		{
//			System.out.println("something went wrong");
//		}
	}

}
