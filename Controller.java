import java.util.List;
import java.util.Scanner;

public class Controller {

	

		public static void main(String[] args) {
			EmployeeDAOimp empObj = new EmployeeDAOimp();
			System.out.println("-----------Employee Management----------");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Remove Employee");
			System.out.println("4. Get employee by id");
			System.out.println("5. Display all employee");

			System.out.println("6. Exit");
			System.out.println("Enter your choice:");
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
Employee emp = new Employee();

switch(choice)
{
case 1:
	System.out.print("enter employee id : ");
	int id=sc.nextInt();
	System.out.print("enter employee name : ");
	String name=sc.next();
	System.out.print("enter employee address: ");
	String address=sc.next();
	System.out.print("enter employee age : ");
	int age=sc.nextInt();
	System.out.print("enter employee salary: ");
	int salary=sc.nextInt();
	System.out.print("enter employee phone : ");
	int phone=sc.nextInt();
	System.out.print("enter employee designation : ");
	String desg=sc.next();
	Employee emp5=new Employee(id, name, address, age, salary, phone, desg);
	
	empObj.addEmployee(emp5);
	System.out.println(emp5);
	break;
case 2:
	
	
	break;
case 3:
	
	
	break;
case 4:
	
	
	break;
case 5:
	
	
	break;
case 6:
	System.exit(0);
	
	break;

}
//			Employee emp = new Employee(111, "rahul", "Bhopal", 22, 46566.77, 46546656L,"digital marketiong");
//			empObj.addEmployee(emp);
			
//Scanner sc=new Scanner(System.in);
//int id=sc.nextInt();

//			Employee em=empObj.getEmployeeById(id);
			
			//empObj.deleteEmployee(em);
//			empObj.updateEmployee(em);
//			List<Employee> list = empObj.getAllEmployees();
//			list.forEach(System.out::println);
		}

	}

