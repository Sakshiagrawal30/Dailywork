class A extends Object
{ A()

	{
	 super();
	 System.out.println("1");
	}
{
	 System.out.println("2");
}

	
	}
	
	
	

class B extends Demo
{
	B()
	{
		
		super();
		 System.out.println("3");	
		
	}
	B(int a)
	{
		this();
		//this(2,5); 
		 System.out.println("4");	
		
	}
	{
		 System.out.println("5");
		
	}
	

}




public class Superthis {

	public static void main(String[] args) {
	
//A a=new A();
	//B b =new B();
		B b =new B(5);
	}

}
