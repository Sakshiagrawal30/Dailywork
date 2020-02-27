package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;
;

public class EmployeeController {

	public static void main(String[] args) {
		
	
		
			EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
	System.out.println("----------Management system-------");
	System.out.println("1. add employee");
	System.out.println("2. get all employee");
	System.out.println("3. get employee by id");
	System.out.println("4. update employee");

	System.out.println("5. delete employee");

	
			Scanner sc=new Scanner(System.in);
			System.out.println("enter choice");
			int choice=sc.nextInt();
			do{
			switch(choice)
			{
			
			case 1:
				Employee employee = new Employee(101, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
				 employeeDAO.addEmployee(employee);
				break;
			case 2:
				List<Employee> list = employeeDAO.getAllEmployees();
				list.forEach(System.out::println);

				break;
			case 3:
				Employee emp= employeeDAO .getEmployeeById(111);
				 System.out.println(emp);
				break;
			case 4:
				Employee emp2= employeeDAO .getEmployeeById(111);
				emp2.setName("ram");
//				 employeeDAO.updateEmployee(emp2);
				break;
			
			case 5:
				Employee emp1= employeeDAO .getEmployeeById(111);

				employeeDAO.deleteEmployee(emp1);
				break;
			case 6:
				System.exit(0);
			
			}}
			while(choice==6);
	//
	
	//System.out.println(emp);
	//int sa=emp.getId();
	
//	emp.setName("ram");
//	 employeeDAO.updateEmployee(emp);
//		List<Employee> list = empObj.getAllEmployees();
//	list.forEach(System.out::println);
	}

}

