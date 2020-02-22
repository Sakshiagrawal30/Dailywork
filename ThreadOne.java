
//public class ThreadOne extends Thread{
public class ThreadOne implements 	Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{if(i%2!=0)
		{
			System.out.println("thread1 :"+i);
		}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
			
	
	}
	
	


}
