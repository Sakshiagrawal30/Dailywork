import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
String path1="C:\\Users\\admin\\Desktop\\seed\\filehandling\\data.txt";
String path2="C:\\Users\\admin\\Desktop\\seed\\filehandling\\copy.txt";

		//File f=new File(path1);
//		System.out.println("file name is:"+f.getName());
//		System.out.println(f.length());
//		System.out.println(f.getParent());
////		System.out.println(f.r);
		FileInputStream in=new FileInputStream(path1);
		BufferedInputStream bin=new BufferedInputStream(in);
		FileOutputStream out=new 	FileOutputStream(path2);
		BufferedOutputStream bout=new 	BufferedOutputStream(out);
		
		int i;
		
while((i=bin.read())!=-1)
{
	//System.out.println((char)i);
	bout.write(i);
	}
bout.close();
	}

}

