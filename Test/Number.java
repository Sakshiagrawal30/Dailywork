package day28;


	import java.util.Scanner;


	public class Number {

			public void two(int n){
				int original=n;
				int rem=0;
				int div=0;
				 int res=0;
				 for(int i=0;i<2;i++)
				 {
					rem=n%10;
					 div=n/10;
					 if(rem>div)
					 res=rem-div;
					 else
						 res=div-rem;
				 }
				System.out.println(res+""+rem);
			}
			public static void main(String[] args) {

				System.out.println("Enter the two consecutive only for Two Digit ");
				Scanner Sc=new Scanner(System.in);
				int num =Sc.nextInt();
				Number i=new Number();
				i.two(num);
			}
		}

