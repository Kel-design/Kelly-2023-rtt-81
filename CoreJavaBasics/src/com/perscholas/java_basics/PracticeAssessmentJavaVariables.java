package com.perscholas.java_basics;

public class PracticeAssessmentJavaVariables {

	public static void main(String[] args) {

		int x, y, z;
		x = 5;
		y = 10;
		z = x + y;
		System.out.println("The sum is " + z);

		double myNum1 = 1.55d;
		double myNum2 = 2.45d;
		double myNum3 = myNum1 + myNum2;
		System.out.println("The sum is " + myNum3);

		int a;
		a = 20;

		double dnum1;
		dnum1 = 5.55d;

		double dnum2;
		dnum2 = a + dnum1;
		System.out.println("The sum is " + dnum2 + " The sum must be a double");

		int c, d, e;
		c = 75;
		d = 25;
		e = c / d;
		System.out.println("The division answer is " + e);

		int g;
		double f = 75.2;
		g = 25;
		double h = f / g;
		System.out.println((int) h);

		double j = 100.64;
		double k = 20.22;
		double m = j / k;
		System.out.printf("The division answer is %.2f\n", m);

		double p = 100.64;
		double q = 20.22;
		int r = (int) (p / q);
		System.out.println("The division answer as an integer is " + r);

		int xx = 5;
		int yy = 6;
		int qq = yy / xx;
		System.out.printf("The division answer is %.2f",(double) qq);
		

		final int LENGTH = 10;
		int height = 20;
		int area = LENGTH * height;
		System.out.println("The area is " + area);
		
		double coffee = 1.50;
		double espresso = 3.25;
		double muffin = 2.30;
		double subtotal = (3 * coffee) + (4 * espresso) + (2 * muffin);
		final double SALES_TAX = 0.8;
		double totalSale = subtotal * SALES_TAX;
		System.out.printf("The totalSale is $ %.2f", totalSale);
		
		
		
		
				
				

	}
}
