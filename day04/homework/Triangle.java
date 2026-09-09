package homework;

public class Triangle {
	private double a;
	private double b;

	public Triangle(double a, double b) {
		this.a = a;
		this.b = b;
		
	}
	
	public double findArea() {
		return (a * b)/ 2.0;
	}
	public double geta() {
		return a;
	}
	public double getb() {
		return b;
	}
	
	public boolean isSameArea(Triangle t) {
	    return findArea() == t.findArea();
	}
}