package legato;
import java.util.Scanner;

public class EmpTest {
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	
	
	Manager mg=new Manager();
	System.out.println("please enter name");	
	String name = scanner.next();
	mg=getName(name);
	

	System.out.println("please enter age");
	int age= scanner.nextInt();
	mg=setAge(age);
	

	System.out.println("please enter salary");
	double salary = scanner.nextInt();
	mg=setSalary(salary);
	

	System.out.println("please enter address");
	String address =scanner.next();
	mg=setaddress(address);
	
	System.out.println("please enter no of employees");
	int noofemp = scanner.nextInt();
	mg=setNoOfEmployees(noofemp);
	
	mg.getEmployeeDetails();
	mg.setNoOfEmployeeDetails();
	
	

}

}