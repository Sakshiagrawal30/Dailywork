import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) throws IOException
	{
		String path="C:\\Users\\admin\\Desktop\\seed\\filehandling\\one.txt";
		FileWriter out=new 	FileWriter(path);
		String msg="file writed data";
		String bookname="abc";
		String authorname="gujj";
		String price="200";
		out.write(bookname+"\t"+ authorname+"\t"+ price);
		
		out.close();
	}	
	
}
