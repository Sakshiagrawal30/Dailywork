package Day26;

import java.util.Scanner;

public class Sumofelements {

	public static void main(String[] args) {

		System.out.println("enter no of elements");
Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[],sum=0;
		arr=new int[size];
		System.out.println("enter elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of elements of array="+sum);

	}

}
