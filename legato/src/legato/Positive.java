package legato;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args)
	{
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		a=scan.nextInt();
		ValidateTest v=new ValidateTest();
		v.validate(a);
		
	}
}
