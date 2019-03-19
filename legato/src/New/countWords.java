package New;

public class countWords {
public static void main(String [] args) {
	String str="My name is khan and I am not a terrorist";
	int count=1;
	for(int i=0;i<str.length();i++)
	{
		
	if((str.charAt(i)==' ')&&(str.charAt(i)!=' '))
	{
		count++;
	}
		
}
			System.out.println("the no of words\n"+count);
				
		}
}
