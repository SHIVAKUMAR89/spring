package legato;
import java.util.Scanner;
public class Employee{  
    String name;  
        int age;  
        long salary;   
        void getEmployee()  
        {  
         Scanner s= new Scanner(System.in);  
         System.out.println("Enter Name of Employees\n");  
         name=s.nextLine();  
         System.out.println("Enter the Age of Employee\n");  
         age=s.nextInt();  
         System.out.println("Enter the Salary\n");  
         salary=s.nextInt();  
        }  
       /* void calctotal()  
        {  
            totalsalary=salary+bonus;  
        }  */
        void print()  
        {  
            System.out.println("Name of Employee\n"+name);  
            System.out.println("Salary of Employee\n"+salary);  
            System.out.println("Age of Employee\n"+age);  
         
        }  
           
       
    public static void main(String[] args) {  
          
        Employee emp = new Employee();  
        emp.getEmployee();    
        emp.print();  
     
    }  
      
}  