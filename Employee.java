
public class Employee  {

	int id;
	String name;
	String address;
	String desg;
	int age;
	double salary;
	long phone;

	public Employee(int id, String name, String address, int age, double salary, long phone, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
		this.desg = desg;
	}



	
	
	public Employee()
	{}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public String getDesg() {
		return desg;
	}



	public void setDesg(String desg) {
		this.desg = desg;
	}



	





	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", desg=" + desg + ", age=" + age
				+ ", salary=" + salary + ", phone=" + phone + "]";
	
	
		//return id+" : "+name+" : "+desg+":"+age;
	}







}

