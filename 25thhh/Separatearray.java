package Day26;

import java.util.Scanner;

public class Separatearray {

	public static void main(String[] args) {
		System.out.println("enter no of elements of array");
		Scanner sc=new Scanner(System.in);
				int size=sc.nextInt();
				int arr[];
				int count=0;
				arr=new int[size];
				int evenarr[]=new int[size];
				int oddarr[]=new int[size];
				int count1=0,count2=0;
			
				System.out.println("enter elements of array");
				for(int i=0;i<size;i++)
				{
					arr[i]=sc.nextInt();
				}
				
				for(int i=0;i<size;i++)
				{
					
					if(arr[i]%2==0)
					
					{evenarr[count1]=arr[i];
						count1++;
						
					}
					else
					{oddarr[count2]=arr[i];
						count2++;
					}
				}
				
				for(int i=0;i<count1;i++)
				{
					System.out.println(evenarr[i]);
				}
				for(int i=0;i<count2;i++)
				{
					System.out.println("Odd"+oddarr[i]+" ");
				}
	}

}
