package Stream;
import java.io.*;
public class FileDemo {
	public static void main(String[] args)
	{
		FileReader fis=null;
		FileWriter fos=null;
		try
		{
		fis=new FileReader("E:\\abc.txt");
		fos=new FileWriter("abc.txt");
			int i;
					while((i=(fis.read()))!=-1) {
						System.out.println((char)i);
					fos.write((char)i);
					}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally 
		{
			if(fis!=null)
				try
			{
					fis.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			if(fos!=null)
				try
			{
					fos.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
