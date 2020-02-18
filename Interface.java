interface Demo1
{
	
int add(int a,int b);

}
class Implementation implements Demo1
{
	
public int add(int a,int b)
{
return a+b;

}
}

public class Interface {

	public static void main(String[] args) {

		Implementation i=new Implementation();
		System.out.println(i.add(2, 3));
	}

}
