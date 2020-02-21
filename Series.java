
public class Series {

	public static void main(String[] args) {
	
		int no =36;
		int count=0;
		for (int i=no;i>=10;i--)
		{
		    count++;
			System.out.println(i);
			i--;
			if (count%2==0)
				i=i-2;
//		if(i%2==0)
//			i=i-2;
		}
		
		

	}

}
