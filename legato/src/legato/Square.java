package legato;

public class Square extends Shape{
	private double length;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length=length;
	}
	public double caluclateArea(){
	double area=0;
	area=this.length*this.length;
	return area;
	}


}
