
public class Th1 extends Thread{

	@Override
	public void run() {
		int a,n=2,i;
		for(i=1;i<=10;i++)
		{
			a=n*i;
			System. out. println(n+" * "+i+" = "+a);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

	
	
	
}
