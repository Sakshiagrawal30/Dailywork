
public class ThreadDemo2 {


		public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		// we have only 1 thread (main)
		Resource res=new Resource();
		Tread1 thread1=new Tread1(res);//new born state
		Thread2 thread2=new Thread2(res);
	Thread t1=new Thread (thread1);
	Thread t2=new Thread (thread2);
	t1.start();//ready state
	t2.start();
	//t1.run();
	//t2.run();


		
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println(Thread.currentThread().getName()+":"+i);
//		}

		}

	}


