package Day26;

import java.util.Scanner;

public class Duplicateelements {
	public static void main(String[] args) {
		
		System.out.println("enter no of elements of array");
		Scanner sc=new Scanner(System.in);
				int size=sc.nextInt();
				int arr[];
				int count=0;
				arr=new int[size];
				
				System.out.println("enter elements of array1");
				for(int i=0;i<size;i++)
				{
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<size;i++)
				{
					for(int j=0;j<size-1;j++)
					{
				if(arr[j]==arr[j+1])
				{
				count++;
				}}
				}
				System.out.println("the duplicate elements in array ="+count);
		
	}

}
