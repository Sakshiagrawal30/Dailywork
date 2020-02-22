
public class Tennis {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("player 1 ready");
		System.out.println("player 2 ready");
		Player1 P1 = new Player1();
		Player2 P2 = new Player2();
Thread t1=new Thread(P1);
Thread t2=new Thread(P2);
t1.start();
t1.join();
t2.start();

//t1.setPriority(Thread.MAX_PRIORITY);
//t2.setPriority(Thread.NORM_PRIORITY);
//Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
	

}

}
