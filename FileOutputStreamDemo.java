import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.IIOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		//FileOutputStream out=new FileOutputStream("C:\\Users\\admin\\Desktop\\seed\\filehandling\\data.txt");
		
		String path="C:\\Users\\admin\\Desktop\\seed\\filehandling\\data.txt";
		FileOutputStream out=new FileOutputStream(path,true);
		String msg="cts training pune batch 7 2020";
		byte b[]=msg.getBytes();
		out.write(b);
		out.close();
	}

}
