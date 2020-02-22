
public class ThreadDemo {

	public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	// we have only 1 thread (main)
	ThreadOne threadone=new ThreadOne();//new born state
	ThreadTwo threadtwo=new ThreadTwo();
Thread t1=new Thread (threadone);
Thread t2=new Thread (threadtwo);
//	t1.start();//ready state
//t1.run();
//t2.run();


Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(Thread.NORM_PRIORITY+2);
t1.start();
	t2.start();
	
	System.out.println("main thread priority:"+Thread.currentThread().getPriority());
	System.out.println("thread1 priority:"+t1.getPriority());
	System.out.println("thread2 priority:"+t2.getPriority());

	
//	for(int i=1;i<=5;i++)
//	{
//		System.out.println(Thread.currentThread().getName()+":"+i);
//	}

	}

}
