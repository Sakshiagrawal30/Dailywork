package Day26;

import java.util.Scanner;

public class Sortarray {

	public static void main(String[] args) {
		System.out.println("enter no of elements of array");
		Scanner sc=new Scanner(System.in);
				int size=sc.nextInt();
				int arr[];
				
				arr=new int[size];
				int temp;
				System.out.println("enter elements of array");
				for(int i=0;i<size;i++)
				{
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<size;i++)
				{for(int j=i+1;j<size;j++) {
					if(arr[i]>arr[j])
					{
						temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
				}}
				
				for(int i=0;i<size;i++)
				{
				System.out.println(arr[i]);
				}
				
	}

}
