package legato;

import java.util.Scanner;

public class Revers {
	public static void main(String args[])
	   {
	      int a, rev = 0;
	         
	      System.out.println("Enter an integer to reverse");
	      Scanner in = new Scanner(System.in);
	      a = in.nextInt();
	         
	      while(a != 0)
	      {
	          rev = rev * 10;
	          rev = rev + a%10;
	          a = a/10;
	      }
	       
	      System.out.println("Reverse of the number is " + rev);
	   }
	}

