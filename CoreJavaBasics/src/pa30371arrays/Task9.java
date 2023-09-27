package pa30371arrays;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
		int[] myNumber = { 4, 2, 9, 13, 1, 0 };
		Arrays.sort(myNumber);
		System.out.printf(Arrays.toString(myNumber));

		int minVal = Integer.MAX_VALUE;
		for (int i = 0; i < myNumber.length; i++) {
			if (myNumber[i] < minVal) {
				minVal = myNumber[i];
			}
		}
		System.out.println("\nminVal =" + minVal);

		int maxVal = Integer.MIN_VALUE;
		for (int i = 0; i < myNumber.length; i++) {
			if (myNumber[i] > maxVal) {
				maxVal = myNumber[i];

			}
		}
		System.out.println("\nmaxVal =" + maxVal);
	}
}
