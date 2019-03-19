package legato;

public class shapeDemo {
public static void main(String[] args) {
	
	Circle c=new Circle();
	c.setRadious(10);
	System.out.println("circle area"+c.caluclateArea());
	
	Square s=new Square();
	s.setLength(10);
	System.out.println("square area"+s.caluclateArea());
}
}
