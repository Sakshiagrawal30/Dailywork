
public class StringBufferDemo {

	public static void main(String[] args) {

		
		StringBuffer b=new StringBuffer();
		   System.out.println(b.capacity());
		   b.append("hello to java version 8");
		   
		   System.out.println(b.capacity());
		   b.append("this is my version");
		   System.out.println(b.capacity());


b.insert(7,"dear");
System.out.println(b);
b.replace(7,20,"nice");
System.out.println(b);
b.delete(7,20);
System.out.println(b);
b.reverse();
System.out.println(b);

	}

}
