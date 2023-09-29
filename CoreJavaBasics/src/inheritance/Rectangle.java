package inheritance;

public class Rectangle extends Shape {

	private double height;
	private double width;
	
	public Rectangle() {
		super(); // calling the parent class
	}
	
	//this is the specific formula for the area
	// of a rectangle.  This is implementation of the 
	// Area interface
	public double calculatePerimeter() {
		return 2 *(height * width);
	}
	
	public double calculateArea() {
		return height * width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
