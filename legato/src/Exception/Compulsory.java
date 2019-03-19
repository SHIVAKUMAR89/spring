package Exception;

import java.util.Scanner;

public class Compulsory {
public static void main(String[] args) throws NmaeInvalidExceptionion {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter name");
	String name=s.next();
	try {
	validateName(name);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
public static void validateName(String name) throws NmaeInvalidExceptionion {
	String pattern="^[A-Za-z0-9]+$";
	if(pattern.matches(pattern))
		System.out.println("Valid name");
	else
		System.out.println("Invalid name");
	throw new NmaeInvalidExceptionion("Compulsory name is invalid");
}
}
