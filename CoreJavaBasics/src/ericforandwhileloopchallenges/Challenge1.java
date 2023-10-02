package ericforandwhileloopchallenges;

import java.util.stream.IntStream;

public class Challenge1 {

	public static void main(String[] args) {

// write a for loop that calculates the sum of all the numbers between 1 and 100

		int n = 100;

		int[] arr = IntStream.rangeClosed(1, 100).toArray();
		for (int i = 1; i < 100; i++) {
			int sumNumbers = 0;
			System.out.print(i + "");
			sumNumbers += i;

		}
	}
}
