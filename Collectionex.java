import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class Collectionex {
	
	public static void main(String[] args) {
		TreeSet<String>set=new TreeSet<>();
		set.add("hello");
		set.add("to");
		set.add("java");
		set.add("batch");
		set.add("batch");
		set.add("batch");
		set.add("7");
		set.add("true");
		//set.add(2,"core");
		//list.remove(6);
		//System.out.println(list.contains("python"));
		//System.out.println(list.size());

	Iterator<String> it=set.iterator();
		System.out.println("....forward direction.......");

		while(it.hasNext())
		{
			String ele=it.next();
			System.out.println(ele);
			//if(ele.equals("java"))
			//{
			//	break;
			//}
		}
	/*	System.out.println("......backward direction.......");
		while(it.hasPrevious())
		{
			String ele=it.previous();
			System.out.println(ele);
		}
		System.out.println("the ele is="+list.get(2));

//System.out.println(list);
//for(String obj:list)
//{System.out.println(obj);
//if(obj.equals("java"))
//{
//	break;
//	}
	*/
//}

	}

}
