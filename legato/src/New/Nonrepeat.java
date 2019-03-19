package New;

import java.util.Scanner;

public class Nonrepeat {
	public static void main (String[] args) {
	//Scanner scan= new Scanner(System.in);
	//System.out.println("Enter a String");
	//String s = scan.next();
		String s="welcome to legato";
	int count=0;
    
        for (Character ch:s.toCharArray()) 
        { 
            if (s.indexOf(ch)==s.lastIndexOf(ch)) 
            { 
                System.out.println("First non-repeating character is \n"+ch);
                break;
            }    
        }   
	}
}
