package Day26;

import java.util.Scanner;

public class Maxandmin {

	public static void main(String[] args) {
		System.out.println("enter no of elements of array");
		Scanner sc=new Scanner(System.in);
				int size=sc.nextInt();
				int arr[];
				arr=new int[size];
				
				int min=arr[0];
				int max=arr[0];
			
				System.out.println("enter elements of array");
				for(int i=0;i<size;i++)
				{
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<size;i++)
				{
					if(arr[i]<min)
					{
						min=arr[i];
						
					}
					else
					{
						min=arr[0];
					}
				}
				
					for(int i=0;i<size;i++) {
				if(arr[i]>max)
				{
					max=arr[i];
					
				}
					}
					System.out.println("the min ele is="+min+"and max ele is="+max);
				}
	}


