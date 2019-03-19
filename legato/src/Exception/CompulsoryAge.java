package Exception;

import java.util.Scanner;

public class CompulsoryAge {
	public static void main(String[] args) throws AgeInvalidException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age");
		int age=s.nextInt();
		validateAge(age);

		
	}
	public static void validateAge(int age) throws AgeInvalidException {
		if(age>=18)
			System.out.println("valid age");
		else
			System.out.println("throw exception");

}
}
