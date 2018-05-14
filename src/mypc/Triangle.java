package mypc;

public class Triangle {
	private double a = 0.0;
	private double b = 0.0;
	private double c = 0.0;
	public double space;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	public double calcSpace() {
		double p = (a+b+c)/2;
		space = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return space;
	}
	
	public String toString() {
	if(((a+b)<=c) | ((a+c)<=b) | ((b+c) <=a)) {
		return "Such triangle can`t be build";
	}else {
		calcSpace();
		return "Triangle space = " + Math.round(space);
	}
}
}
