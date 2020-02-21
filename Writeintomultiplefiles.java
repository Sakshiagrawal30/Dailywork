import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Writeintomultiplefiles {

	public static void main(String[] args) throws IOException   {
		String path1="C:\\Users\\admin\\Desktop\\seed\\filehandling\\cse.txt";
		String path2="C:\\Users\\admin\\Desktop\\hello.java";
		
			
//		String path3="C:\\Users\\admin\\Desktop\\seed\\filehandling\\ec.txt";
//		String path4="C:\\Users\\admin\\Desktop\\seed\\filehandling\\me.txt";
				FileInputStream fin1=new  	FileInputStream(path1);
				FileInputStream fin2=new  	FileInputStream(path2);
				SequenceInputStream sis=new  SequenceInputStream(fin1,fin2);
				int i;
				while((i=sis.read())!=-1)
				{
				System.out.println((char)i);

					}
				
//				FileInputStream fin3=new  	FileInputStream(path3);
//				FileInputStream fin4=new  	FileInputStream(path4);
//ByteArrayOutputStream bout=new ByteArrayOutputStream();
//String data="this is common data write in all files";	
//byte[]b =data.getBytes();
//bout.write(b);
//bout.writeTo(out1);
//bout.writeTo(out2);
//bout.writeTo(out3);
//bout.writeTo(out4);
				
				
//Vector v=new Vector();
//v.add(fin1);
//v.add(fin2);
//v.add(fin3);
//v.add(fin4);
//Enumeration en=v.elements();
//int i;
//SequenceInputStream sis=new  SequenceInputStream(en);
//while((i=sis.read())!=-1)
//{
//System.out.println((char)i);
//
//	}
//		
}
}
