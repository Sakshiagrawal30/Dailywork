
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOimp {

	
		static ArrayList<Employee> employees = null;

		static {
			employees = new ArrayList<>();
			Employee emp1=new Employee(1234,"sakshi","harda",22,20000,70788988,"developer");
			Employee emp2=new Employee(5678,"harshita","indore",21,40000,7063738,"test engiener");
			Employee emp3=new Employee(1289,"disha","indore",20,20000,70788988,"developer");
			Employee emp4=new Employee(6764,"shakti","lucknow",23,20000,707877788,"test engineer");
			employees.add(emp1);
			employees.add(emp2);
			employees.add(emp3);
			employees.add(emp4);
		}

		public void addEmployee(Employee employee) {
			employees.add(employee);
		}
//
//		public void deleteEmployee(Employee employee) {
//employees.remove(employee);
//		}

		public void updateEmployee(Employee employee) {

			
		
		}

//		public Employee getEmployeeById(int id) {
//			for( Employee emp:employees ) { 
//				   if(emp.getId()==id) { 
//				     return emp;
//				   }
//				}
//			return null;
//			
//			
//		}

		public List<Employee> getAllEmployees()  {
			return employees;
		}

	}
	

