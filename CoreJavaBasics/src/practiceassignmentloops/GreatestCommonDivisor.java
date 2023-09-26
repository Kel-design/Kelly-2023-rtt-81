package practiceassignmentloops;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		int i;
		System.out.println("Enter a positive integer:  ");
		int n1 = input.nextInt();
		System.out.println("Enter another positive integer:  ");
		int n2 = input.nextInt();

		while(n1!=n2) {
			if(n1>n2) {
				n1=n1-n2;
			}else 
				n2=n2-n1;
		}
		System.out.printf("GCD of n1 and n2 is: " +n2);
			}
		
}

