
public class MainThread {

	public static void main(String[] args) {
	Thread t=Thread.currentThread();
// static method inside thread class	
	System.out.println(t);
	System.out.println(t.getName());
	t.setName("Thread 1");
	System.out.println(t);
	System.out.println(t.getPriority());
	System.out.println(t.isDaemon());
	System.out.println(t.isAlive());
	}

}
