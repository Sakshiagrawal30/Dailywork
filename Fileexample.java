
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fileexample {
	String bookname;
	String authorname;
	String price;
	public void menu()
	{
		System.out.println("Select one of the two option provided :");
		System.out.println("1 Input the book details");
		System.out.println("2 Display the book details");
	}
	   public void inputData(String path) throws IOException
	   {
		   InputStreamReader ir=new InputStreamReader(System.in);
		   BufferedReader br=new BufferedReader(ir);
		   System.out.println("Enter the book name = ");
		   bookname=br.readLine();
		   System.out.println("Enter the author namer = ");
		   authorname=br.readLine();
		   System.out.println("Enter the price = ");
		   price=br.readLine();
		   //String path = "C:\\Users\\admin\\eclipse-workspace\\fileexample\\data.txt";
		   FileOutputStream out = new FileOutputStream(path, true);





		   String message= bookname + " "+authorname + " "+price+ " \n" ;
		  // System.out.println(message);
		   byte b[]=message.getBytes();
			out.write(b);
			out.close();

	   }
	   public void displayData(String path) throws IOException
	   {    //String path = "C:\\Users\\admin\\eclipse-workspace\\fileexample\\data.txt";
		   File file = new File(path);
		   FileInputStream in=new FileInputStream(file);
		   int i;
			while((i=in.read()) !=-1)
			{
				System.out.print((char)i);
			}
	   }

	   




	public static void main(String[] args) throws IOException 
	{

		String path = "C:\\Users\\admin\\eclipse-workspace\\fileexample\\data.txt";
		FileOutputStream out = new FileOutputStream(path, true); {

		int i;
	Fileexample at=new Fileexample();
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		if(i==1)
		{
			at.inputData(path);
			at.menu();
		}
		if(i==2)
		{
			at.displayData(path);
			at.menu();
		}

	}

	}}