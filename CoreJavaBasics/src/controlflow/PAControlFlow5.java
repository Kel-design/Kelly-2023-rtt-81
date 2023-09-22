package controlflow;

import java.util.Scanner;

public class PAControlFlow5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your number score:  ");
		int score = sc.nextInt();
	
		// validate user input
		if ((score < 0) || (score > 100)) {
			System.out.println("Score out of range");
			System.exit(0);
		}

		if (score >= 90) {
			System.out.print("A");
		} else if (score >= 80) {
			System.out.print("B");
		} else if (score >= 70) {
			System.out.print("C");
		} else if (score >= 60) {
			System.out.print("D");
		} else if (score < 60) {
			System.out.print("F");

		}

	}
}
