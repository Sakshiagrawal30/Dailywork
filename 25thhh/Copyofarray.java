package Day26;

import java.util.Scanner;

public class Copyofarray {

	public static void main(String[] args) {
		System.out.println("enter no of elements of array");
		Scanner sc=new Scanner(System.in);
				int size=sc.nextInt();
				int arr1[],arr2[];
				arr1=new int[size];
				arr2=new int[size];
				System.out.println("enter elements of array1");
				for(int i=0;i<size;i++)
				{
					arr1[i]=sc.nextInt();
				}
				System.out.println("the new array is");
				
				for(int i=0;i<size;i++)
				{
					arr2[i]=arr1[i];
					System.out.println(arr2[i]);
				}
			

	}

}
