package com.cts.training.dao.impl;

import com.cts.training.dao.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection con = getConnection();
	PreparedStatement ps = null;

	@Override
	public boolean addEmployee(Employee employee) {

		String sql = "insert into employee values(?,?,?,?,?,?,?)";

		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getAge());
			ps.setFloat(5, employee.getPhone());
			ps.setDouble(6, employee.getSalary());
			ps.setString(7, employee.getDesignation());
			ps.executeUpdate();
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		String sql = "delete from employee where id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, employee.getId());
			int result = ps.executeUpdate();

			if (result > 0) {
				System.out.println("data deleted successfully");
			} else {
				System.out.println("try again");
			}
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean updateEmployee(Employee employee) {
		String query = "update employee set name=? where id=?";
		try {
			ps = con.prepareStatement(query);
			// PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getId());

			int rs = ps.executeUpdate();
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee getEmployeeById(int id) {

		// List<Employee> employees=new ArrayList<Employee>();
		String sql = "select * from employee where id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			Employee emp = null;
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));

				emp.setAddress(rs.getString("address"));
				emp.setAge(rs.getInt("age"));
				emp.setPhone(rs.getInt("phone"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setDesignation(rs.getString("designation"));

			}
			return emp;

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return null;

	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "select * from employee";
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getLong("phone"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setDesignation(rs.getString("designation"));
				employees.add(emp);

			}
			return employees;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	private Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			con = DriverManager.getConnection(url, "root", "root");

		} catch (Exception e) {
			return null;
		}
		return con;
	}

}

//	static ArrayList<Employee> employees = null;
//
//	static {
//		employees = new ArrayList<>();
//		Employee emp1 = new Employee(4234, "Vijay", "Bangalore", "Developer", 20, 41241.89, 79879798L);
//		Employee emp2 = new Employee(2324, "Neeraj", "Mumbai", "Software Engineer", 21, 23434.89, 121313L);
//		Employee emp3 = new Employee(9987, "Sakshi", "Indore", "Test Engineer", 19, 19889.80, 979879798L);
//		Employee emp4 = new Employee(1234, "Neha", "Pune", "DevOps Engineer", 23, 68908.12, 43432222L);
//		employees.add(emp1);
//		employees.add(emp2);
//		employees.add(emp3);
//		employees.add(emp4);
//	}
//
//	public void addEmployee(Employee employee) {
//		employees.add(employee);
//	}
//
//	public void deleteEmployee(Employee employee) {
//
//	}
//
//	public void updateEmployee(Employee employee) {
//
//	}
//
//	public Employee getEmployeeById(int id) {
//		return null;
//	}
//
//	public List<Employee> getAllEmployees() {
//		return employees;
//	}
