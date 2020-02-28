package Day27th;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(20);
	list.add(40);
	list.add(35);
	list.add(80);
	list.add(62);
	System.out.println(list);
	//ListIterator<Integer> li=list.listIterator();
	
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)%2==0 && list.get(i)%5==0)
		{
			System.out.println("divisible by 2 and 5 ="+list.get(i));
		}
		
	}
	for(int i=0;i<list.size();i++)
	{
		
		{int value=list.get(i)*2;
			System.out.println("double the elements ="+value);
		}
		
	}
	
	}

}
