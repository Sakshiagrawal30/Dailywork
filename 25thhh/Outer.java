package Day26;

public class Outer {
int x=10;
static int y=20;
static class Inner
{
public void display()
{
	System.out.println(y);
	//System.out.println(x);
}
}
	

public static void main(String args[])
{
Outer.Inner in=new Outer.Inner();
in.display();
}
}