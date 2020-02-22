
public class ThDemo {

	public static void main(String[] args) throws InterruptedException {
		Th1 th1=new Th1();
		Th2 th2=new Th2();
		Thread t1=new Thread (th1);
		Thread t2=new Thread (th2);
		t1.start();
		t1.join();
		t2.start();
		
	}

}
