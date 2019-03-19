package JavaTest;

import java.util.LinkedList;
import java.util.List;

public class revString {
	public static void main(String args[])
	   {   
	  String temp;
	   List<String> al = new LinkedList<String>();
	   al.add("java");
	   al.add("C++");
	   al.add("SQL");
	   al.add("HTML");
	   System.out.println("before");
	   for(int i=0;i<al.size();i++)
	   {
		   System.out.println(al.get(i));  
	   }
	   
	   for(int i=0;i<al.size()/2;i++){
		   temp=al.get(i);
		   al.set(i,al.get(al.size()-1-i));
		   al.set(al.size()-1-i,temp);
		   
	   }
	   System.out.println("After    ");
	   for(int i=0;i<al.size();i++)
	   {
		
	System.out.println(al.get(i));
	   }

}
}
