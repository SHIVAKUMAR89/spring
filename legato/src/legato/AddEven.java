package legato;

import java.util.Scanner;

public class AddEven {
	public static void main(String[] args){
		int num;
		System.out.println("enter no");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
	}
}
