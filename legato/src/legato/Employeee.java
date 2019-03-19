package legato;

public class Employeee {

	private String name;
	private String address;
	private int age;
	private double salary;
	private Object noofemp;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public int getNoOfEmployees()
	{
		return (int) noofemp;
	}
	public void setNoOfEmployees(int age)
	{
		this.noofemp=noofemp;
	}
	

	void getEmployeeDetails()
	{
		
		System.out.println("name=" + this.getName() +"\n"+ "age=" + this.getAge()+"\n"+ "address=" + this.getAddress()+"\n"+ "salary=" + this.getSalary());
	
	}
	
}



