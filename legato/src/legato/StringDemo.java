package legato;

import java.util.Scanner;

public class StringDemo {
public static void main(String[] args) {
	
	String test = "a 1 b 2 c 3";
	count(test);

}
public static void count(String x){
	char[] ch = x.toCharArray();
	int letter = 0;
	int space = 0;
	int num = 0;
	int other = 0;
	
	for(int i = 0; i < x.length(); i++){
		if(Character.isLetter(ch[i])){
			letter ++ ;
		}
		else if(Character.isDigit(ch[i])){
			num ++ ;
		}
		else if(Character.isSpaceChar(ch[i])){
			space ++ ;
		}
		else if(Character.isAlphabetic(ch[i])) {
			int alphabetic=0;
			 alphabetic ++;
		}
		else
		{
			other++;
		}
	}
	System.out.println("a 1 b 2 c 3");
	System.out.println("letter: " + letter);
	System.out.println("space: " + space);
	System.out.println("number: " + num);
	System.out.println("other: " + other);
		}


}

