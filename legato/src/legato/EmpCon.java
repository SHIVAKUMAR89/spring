package legato;

public class Emp 
{ 
    int age, sal; 
    String nme; 
    Emp() 
       { 
          age=23; 
          nme="Nsp"; 
          sal=42000; 
       } 
    Emp(int x, String y) 
            { 
               age=x; 
               nme=y; 
               sal=60000; 
            } 
    Emp(int x, String y,  int z) 
                 { 
                    age=x; 
                    nme=y; 
                    sal=z; 
                 } 
                    void ShowDetail() 
                       { 
                    	System.out.println("Employee Name :"+nme);
                            System.out.println("Employee Code :"+age); 
                            System.out.println("Employee Salary :"+sal); 
                       } 
 }; 
       class EmpCon 
          { 
              public static void main(String args[]) 
                 { 
            	  Emp e1 = new Emp(); 
            	  Emp e2 = new Emp(24,"Shiva"); 
            	  Emp e3 = new Emp(25, "Kumar", 90000); 
                    e1.ShowDetail(); 
                     e2.ShowDetail(); 
                     e3.ShowDetail(); 
                 } 
         }; 