package Day26;

import java.util.Scanner;

public class Reverseofarray {
public static void main(String[] args) {
	

		System.out.println("enter no of elements");
Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[];
		arr=new int[size];
		System.out.println("enter elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("reverse elements are=");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
}	
}
