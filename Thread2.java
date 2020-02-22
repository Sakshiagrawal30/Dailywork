
public class Thread2 implements Runnable {
	
	Resource res;
	public Thread2(Resource res)
	{
		this.res=res;
		
	}
	@Override
	public void run() {
	res.display("thread2");
		
	}


}
