import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {
		
ArrayList<Employee> list=new ArrayList<>();
addEmployees(list);
//Collections.sort(list);
//System.out.println(list);
//for(Employee emp:list)
//{System.out.println(emp);

	//Collections.sort(list,new Sortbyid());
Collections.sort(list,new Sortbydesg());

	for(Employee emp:list)
	{
		System.out.println(emp);
	}
	}



	

	private static void addEmployees(ArrayList<Employee> list) {
		Employee emp1=new Employee(1234,"sakshi","harda",22,20000,70788988,"developer");
		Employee emp2=new Employee(5678,"harshita","indore",21,40000,7063738,"test engiener");
		Employee emp3=new Employee(1289,"disha","indore",20,20000,70788988,"developer");
		Employee emp4=new Employee(6764,"shakti","lucknow",23,20000,707877788,"test engineer");
list.add(emp1);
list.add(emp2);
list.add(emp3);
list.add(emp4);
}

}
