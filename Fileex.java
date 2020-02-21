import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fileex {

	private char ch;

	public static void main(String[] args) throws IOException {
		String bookname;
		String authorname;
		String price;
		 Fileex f=new  Fileex();
		 char ch;
	Scanner sc=new Scanner(System.in);
		String path="C:\\Users\\admin\\Desktop\\seed\\filehandling\\two.txt";
		
		System.out.println("1.input info");
		System.out.println("2.display info");
	do
	{
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			
			
			 InputStreamReader in=new InputStreamReader(System.in);
			   BufferedReader br=new BufferedReader(in);
		
		
			   System.out.println("Enter the book name = ");
			   bookname=br.readLine();
			   System.out.println("Enter the author namer = ");
			   authorname=br.readLine();
			   System.out.println("Enter the price = ");
			   price=br.readLine();
			 //  String path="C:\\Users\\admin\\Desktop\\seed\\filehandling\\two.txt";
			   FileOutputStream out = new FileOutputStream(path, true);





			   String message= bookname + " "+authorname + " "+price+ " \n" ;
			  // System.out.println(message);
			   byte b[]=message.getBytes();
				out.write(b);
				out.close();
		
			break;
			
		case 2:
	 File file = new File(path);
			   FileInputStream inn=new FileInputStream(file);
			   int i;
				while((i=inn.read()) !=-1)
				{
					System.out.print((char)i);
				}
		   

			break;
		}
		System.out.println("do u want to continue y or n");
		f.ch=sc.next().charAt(0);
	}while(f.ch=='y'); 

	}}


