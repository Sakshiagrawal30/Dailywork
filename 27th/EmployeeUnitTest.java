package Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class EmployeeUnitTest {

	private static EmployeeDAO employeeDAO;
	private static Employee employee;

	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDAO = new EmployeeDAOImpl();

	}

	@Ignore
	@Test
	public void test_add_employee_success() {
		Employee employee = new Employee(123, "rita", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		employeeDAO.addEmployee(employee);
	}
	@Test(expected = MySQLIntegrityConstraintViolationException.class )
	public void test_add_employee_fail() {
		Employee employee = new Employee(124, "rita", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		employeeDAO.addEmployee(employee);
	}

@Ignore
	@Test
	public void test_update_employee_success() {
//		EmployeeDAO emp2 = new EmployeeDAOImpl();
		Employee emp = employeeDAO.getEmployeeById(10);
		emp.setName("Jay");
	

		assertEquals(true, employeeDAO.updateEmployee(emp));

	}

	@Ignore
	@Test
	public void test_delete_employee_success() {
		Employee emp2 = employeeDAO.getEmployeeById(1);
		assertEquals(true, employeeDAO.deleteEmployee(emp2));

	}

	@Ignore
	@Test(expected = NullPointerException.class)
	public void test_get_employeebyid_success() {
		Employee emp = employeeDAO.getEmployeeById(1);
		assertEquals("sakshi", emp.getName());
	}

	@Ignore
	@Test
	public void test_getall_employee_success() {
		List<Employee> list = employeeDAO.getAllEmployees();

		assertEquals("mumbai", list.get(3).getAddress());
	}
}
