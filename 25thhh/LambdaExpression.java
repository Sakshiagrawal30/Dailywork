package Day26;

public class LambdaExpression {

	public static void main(String[] args) {
//	MyThread t=new MyThread();
//Thread	thread =new 	Thread(t);
//	thread.start();
//	

//	Runnable r=() -> System.out.println("hello");
//	Thread t=new Thread(r);
//	t.start();

		Hello h=() -> "good evening";
		System.out.println(h.greetings());
	}

}
@FunctionalInterface
interface Hello
{
String greetings(); // one abstract method

}


//class MyThread implements Runnable
//{
//
//	@Override
//	public void run() {
//	System.out.println("HELLO");
//		
//	}
//	
//}
