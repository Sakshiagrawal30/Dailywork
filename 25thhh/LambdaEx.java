package Day26;

public class LambdaEx {

	public static void main(String[] args) {
	
Hello2 add=(a,b) -> a+b;
System.out.println(add.calculate(3, 5));
Hello2 sub=(a,b) -> a-b;
System.out.println(sub.calculate(10, 5));
	}

}
@FunctionalInterface
interface Hello2
{
	double calculate(double a,double b );
}