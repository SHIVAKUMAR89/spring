package Exception;

public class FileReader {

	public FileReader(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try{
			FileReader r = new FileReader("abc.txt");
			
		}
catch(Exception e) {
	System.out.println(e);
}
	}

}
