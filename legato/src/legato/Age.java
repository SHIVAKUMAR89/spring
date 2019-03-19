package legato;

import java.util.Scanner;

public class Age {
	public static void main(String[] args)
	{
		int a;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a age");
		a=scan.nextInt();
		if(a>18)
		{
			System.out.println("Voter is Eligible");
		}
		else
		{
			System.out.println("Voter is Not Eligible");
		}
	}

}
