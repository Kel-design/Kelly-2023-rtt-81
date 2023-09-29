package inheritance;

public class Triangle extends Shape {

	public double calculatePerimeter() {
		return base + side2 + side3;
	}

	public double calculateArea() {
		return .5 * base * height;
	}

	private double base;
	private double height;
	private double side2;
	private double side3;

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
