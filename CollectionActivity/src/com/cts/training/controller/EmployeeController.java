package com.cts.training.controller;

import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
		Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		empObj.addEmployee(emp);
		
		List<Employee> list = empObj.getAllEmployees();
		list.forEach(System.out::println);
	}

}

