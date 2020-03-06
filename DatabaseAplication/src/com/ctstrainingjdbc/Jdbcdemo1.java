package com.ctstrainingjdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Jdbcdemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("enter employee id");
//		int id=Integer.parseInt(br.readLine());
		
//		System.out.println("enter employee name");
//		String name=br.readLine();
//		System.out.println("enter employee address");
//		String address=br.readLine();
//		System.out.println("enter employee age");
//		int age=Integer.parseInt(br.readLine());
//		System.out.println("enter employee phone");
//		long phone=Long.parseLong(br.readLine());
//		
		
		Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/ctspune";
	Connection con=DriverManager.getConnection(url,"root", "root")	;	
	//String query="insert into employee values(?,?,?,?,?)";
	//String query="update employee set name=? where id=?";
	//String query="delete from employee where id=?";
	String query="select * from employee";

PreparedStatement ps=con.prepareStatement(query);

ResultSet rs=	ps.executeQuery(query);
int count=1;
while(rs.next())
{
	System.out.println("employee "+count+ " records");
	int id=rs.getInt(1);
	String name=rs.getString(2);
	String address=rs.getString(3);
	int age=rs.getInt(4);
	long phone=rs.getLong(5);

	 System.out.println("id="+id);
	 System.out.println("name="+name);
	 System.out.println("address="+address);
	 System.out.println("age="+age);
	 System.out.println("phone="+phone);
	 count++;
	 
 }
	//System.out.println(id+":"+name+":"+address+":"+age+":"+phone);
	
}
//ps.setString(1, name);
//ps.setInt(2, id);

//ps.setInt(1,id);

//ps.setInt(1, id);
//ps.setString(2, name);
//ps.setString(3, address);
//ps.setInt(4, age);
//ps.setLong(5, phone);
//int result=ps.executeUpdate();
//if(result>0)
//{
//System.out.println("data deleted successfully");
//}
//else
//{System.out.println("try again");
//	}


	


}
