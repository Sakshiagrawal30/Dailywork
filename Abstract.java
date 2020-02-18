abstract class X
{
public void display(){
	
	System.out.println("X");
}	
abstract public int sleepinghours( );

}
 class Y extends X
{
public int 	sleepinghours( )
{
return 8;

}
public String sings()
{
	return "hindisongs";
}
}



public class Abstract {

	public static void main(String[] args) {
	X x=new Y();
	Y y=new Y();
	System.out.println(x.sleepinghours());
	//System.out.println(x.sings());
	

	}

}
