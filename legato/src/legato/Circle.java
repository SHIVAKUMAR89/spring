package legato;

public class Circle  extends Shape{
	private double radious;
	public double getRadious() {
		return radious;
	}
	public void setRadious(double radious) {
		this.radious=radious;
	}
	public double caluclateArea(){
	double area=0;
	area=3.14*this.radious*this.radious;
	return area;
	}
}


