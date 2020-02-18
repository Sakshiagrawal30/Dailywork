import java.util.Scanner;
public class digitsum {
public static void main(String[] args) {
		int sum=0,num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		num=s.nextInt();
		
		while(num!=0)
		{sum=sum+(num%10);
			num=num/10;
			
		}
		System.out.println("sum="+sum);

	}


}
