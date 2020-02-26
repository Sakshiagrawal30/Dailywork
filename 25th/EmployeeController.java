package com.cts.training.controller;

import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;
;

public class EmployeeController {

	public static void main(String[] args) {
		
	
		
			EmployeeDAO empObj = new EmployeeDAOImpl();
	//Employee employee = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
	//empObj.addEmployee(employee);
	Employee emp=empObj.getEmployeeById(111);
	System.out.println(emp);
//empObj.deleteEmployee(employee);
//		List<Employee> list = empObj.getAllEmployees();
//	list.forEach(System.out::println);
	}

}

