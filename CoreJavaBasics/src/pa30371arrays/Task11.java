package pa30371arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many favorite things do you have?:  ");
		int numFavorites = scanner.nextInt();
		scanner.nextLine();
		
		// int[] scoreNumber = score[score];

		String[] favorites = new String[numFavorites];
		for (int pos = 0; pos < numFavorites; pos++) {

			System.out.print("Enter your favorite things #:  " + pos);
			favorites[pos] = scanner.nextLine();

			// somehow need to get their score(#of faves) connected
			// to the number of times the "Enter your favorite things comes up"

		}
		System.out.println(Arrays.toString(favorites));

	}
}
