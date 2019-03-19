package legato;

public class Manager extends Employeee {
	private int noOfEmployees;
	Manager(){
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees=noOfEmployees;
	}
	public void setNoOfEmployeeDetails()
	{
		super.getEmployeeDetails();
		System.out.println("Number of Employees"+this.getNoOfEmployees());
	}
}
