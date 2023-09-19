package variables;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the height: ");
		int height = input.nextInt();
		
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		
		int area = height * width;
		
		if ( height == width ) {
			System.out.println("The height and width are the same so this is a square");
		}
		
		System.out.println("Area of the rectangle is = " + area);
		
		
		

	}

}
