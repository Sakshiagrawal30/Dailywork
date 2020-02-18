class Emp
{
 private int empno,phoneno;	
 private String name, designation, address;

public int getno()
{
	return empno;

}
public void putno(int no)

{empno=no;

}
public int getphoneno()
{
	
return phoneno;

}
public void putphoneno(int ph)

{phoneno=ph;

}

public String getname()
{
	
return name;

}
public void putname(String n)

{name=n;

}
public String getdesg()
{
	
return designation;

}
public void putdesg(String d)

{designation=d;

}
public String getaddress()
{
	
return address;

}
public void putaddress(String a)

{address=a;

}
}

public class Salary extends Emp {
 
	int basicpay, DA, HRA,Grosspay, PF, Incometax,Netpay;
	
	public int getbasicpay()
	{
		return basicpay;
		
		
	}
	public void putbasicpay(int b)
	{
		basicpay=b;
		
		
	}
	
	public int  calculate()
	{
		Grosspay=((12*basicpay)/100)+(2*basicpay)+(basicpay/2)-((10*basicpay)/100);
	return Grosspay;
	}
	public void display()
	{   
		System.out.println(Grosspay);
		
	}
	
	public static void main(String[] args) {


		Salary s=new Salary();
		s.putno(20);
		int empno=s.getno();
		System.out.println(empno);
		
		s.putphoneno(2123456);
		int phoneno=s.getphoneno();
		System.out.println(phoneno);
		
		s.putname("sakshi");
		String name=s.getname();
		System.out.println(name);
		
		s.putdesg("trainee");
		String designation=s.getdesg();
		System.out.println(designation);
		
		s.putaddress("abc");
		String address=s.getaddress();
		System.out.println(address);
		
		s.putbasicpay(20000);
		int basicpay=s.getbasicpay();
		
		s.calculate();
		s.display();
		
	}

}
