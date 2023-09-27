package calc;

//Create a small calculator .. it will be able to do 4 operations - add, subtract, multiply and divide.  
//Each of these will be a single method that does that operation.    
//Ask the user for 2 numbers and then ask the user which operation they want to do.   
//Then do that operation and print the result.   Each operation should not print its own results.   
//All operations should work with double values. (edited) 
//2:32
//So this should be a main function with probably 6 methods ( 4 operations, 1 menu, 1 input )
//2:33
//each operation should take 2 parameters and return a double ...

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner scanner = new Scanner(System.in);
		int select = c.menu(scanner);

		System.out.println("Please enter a number: ");
		double num1 = scanner.nextInt();

		System.out.println("Please enter another number: ");
		double num2 = scanner.nextInt();

		if (select == 1) {
			double addsum = add(num1, num2);
			System.out.println(addsum);
		} else if (select == 2) {
			double substractsum = subtract(num1, num2);
			System.out.println(substractsum);
		} else if (select == 3) {
			double multiplysum = multiply(num1, num2);
			System.out.println(multiplysum);
		} else if (select == 4) {
			double dividesum = divide(num1, num2);
			System.out.println(dividesum);
		} else {
			System.out.println("That is not valid. Please enter a number.");
		}
	}

	private static double add(double num1, double num2) {
		return num1 + num2;
	}

	private static double subtract(double num1, double num2) {
		return num1 - num2;
	}

	private static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	private static double divide(double num1, double num2) {
		return num1 / num2;
	}

	public int menu(Scanner scanner) {

		System.out.println("1) I'd like to Add");
		System.out.println("2) I'd like to Subtract");
		System.out.println("3) I'd like to Multiply");
		System.out.println("4) I'd like to Divide");

		System.out.println("\nWhat do you want to do?");
		int select = scanner.nextInt();
		scanner.nextLine();

		return select;

	}

}
