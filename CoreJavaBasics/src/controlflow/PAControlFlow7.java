package controlflow;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PAControlFlow7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your filing status?  "
				+ "\n(Single, Married Filing Jointly, Married Filing Separately or Head of Household)  ");

		String status = input.nextLine();

		DecimalFormat df = new DecimalFormat("$###,###");
		System.out.print("\nPlease enter your income: ");

		int income = input.nextInt();

		if (status.equalsIgnoreCase("single")) {
			if ((income >= 0) && (income <= 8350)) {
				System.out.println("Your tax rate is 10%");
			} else if ((income >= 8351) && (income <= 33950)) {
				System.out.println("Your tax rate is 15%");
			} else if ((income >= 33951) && (income <= 82250)) {
				System.out.println("Your tax rate is 25%");
			} else if ((income >= 82251) && (income <= 171550)) {
				System.out.println("Your tax rate is 28%");
			} else if ((income >= 1771551) && (income <= 372950)) {
				System.out.println("Your tax rate is 33%");
			} else if (income >= 372951) {
				System.out.println("Your tax rate is 35%");
			}
		}

		if (status.equalsIgnoreCase("married filing jointly")) {
			if ((income >= 0) && (income <= 16700)) {
				System.out.println("Your tax rate is 10%");
			} else if ((income >= 16071) && (income <= 67900)) {
				System.out.println("Your tax rate is 15%");
			} else if ((income >= 67901) && (income <= 137050)) {
				System.out.println("Your tax rate is 25%");
			} else if ((income >= 137051) && (income <= 208850)) {
				System.out.println("Your tax rate is 28%");
			} else if ((income >= 208851) && (income <= 372950)) {
				System.out.println("Your tax rate is 33%");
			} else if (income >= 372951) {
				System.out.println("Your tax rate is 35%");
			}
		}

		if (status.equalsIgnoreCase("married filing separately")) {
			if ((income >= 0) && (income <= 8350)) {
				System.out.println("Your tax rate is 10%");
			} else if ((income >= 8351) && (income <= 33950)) {
				System.out.println("Your tax rate is 15%");
			} else if ((income >= 33951) && (income <= 68525)) {
				System.out.println("Your tax rate is 25%");
			} else if ((income >= 68526) && (income <= 104425)) {
				System.out.println("Your tax rate is 28%");
			} else if ((income >= 104426) && (income <= 186475)) {
				System.out.println("Your tax rate is 33%");
			} else if (income >= 186476) {
				System.out.println("Your tax rate is 35%");
			}
		}

		if (status.equalsIgnoreCase("head of household")) {
			if ((income >= 0) && (income <= 11950)) {
				System.out.println("Your tax rate is 10%");
			} else if ((income >= 11951) && (income <= 45500)) {
				System.out.println("Your tax rate is 15%");
			} else if ((income >= 45501) && (income <= 117450)) {
				System.out.println("Your tax rate is 25%");
			} else if ((income >= 117451) && (income <= 190200)) {
				System.out.println("Your tax rate is 28%");
			} else if ((income >= 190201) && (income <= 372950)) {
				System.out.println("Your tax rate is 33%");
			} else if (income >= 372951) {
				System.out.println("Your tax rate is 35%");
			}
		}

	}
}
