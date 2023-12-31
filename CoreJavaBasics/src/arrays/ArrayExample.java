package arrays;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int arraySize = 10;

		// this creates a new array of type double with 20 elements ... 0 to 19
		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[9] = "nine";

		// this is going to fail and cause code execution to stop
		// stringArray[11] = "eleven";

		// loop over the entire array and print the value in each location
		// it is important to know that you can ask an array how long it is using
		// .length

		System.out.println("=====================");

		// enhanced for loop
		for (String value : stringArray) {
			System.out.println("The value = " + value);

		}

		// write a for loop that counts the number of nulls in the array
		// after the loop completes print that number

		int nullCount = 0;
		for (String value : stringArray) {
			if (value == null) {
				nullCount = nullCount + 1;

			}
		}
		System.out.println("Number of null is " + nullCount);

		// write a for loop that tells me the location of the first null in the array
		// this is going to use the non-enhance for loop

		int firstNull = -1;
		for (int pos = 0; pos < stringArray.length; pos++) {
			if (stringArray[pos] == null) {
				firstNull = pos;
				break;
			}

		}
		System.out.println("Position of the first null is " + firstNull);

		// write a for loop that tells me how many values are not null
		int nullNotCount = 0;// starts with a position of assumption...this case we assume 0
		for (String value : stringArray) {
			if (value != null) {
				nullNotCount = nullNotCount + 1;

			}
		}
		System.out.println("The number of nonNulls is " + nullNotCount);

		// write a for loop that tells me the last position of null in the array
		// this is an old style for loop with an array location
		// by last null postion we mean the position with the highest value
		int lastNull = -1; // asserting b/c it's not part of the array
		for (int pos = 0; pos < stringArray.length; pos++) {
			if (stringArray[pos] == null) {
				lastNull = pos;
			}

		}

		if (lastNull == -1) {
			System.out.println("The array does not have a null");
		} else {
			System.out.println("Position of the last null is " + lastNull);
		}

		// same solution with enhance for loop -- a more simple solution
		int notNullCountEnhanced = 0;
		for (String value : stringArray) {
			if (value != null) {
				notNullCountEnhanced = notNullCountEnhanced + 1;
			}
		}

		// more efficient because it can break the loop once it found its answer
		int lastNullPositionReverse = -1;
		for (int pos = stringArray.length - 1; pos >= 0; pos--) {
			if (stringArray[pos] == null) {
				lastNullPositionReverse = pos;
				break;
			}
		}

		// write a for loop that starts at the final position in the array and counts
		// down to the first

		for (int pos = stringArray.length - 1; pos >= 0; pos--) {
			System.out.println("(Reversed)The value in position " + pos + " is " + stringArray[pos]);
		}

	}

	// use letters.split(",") to make an array of letters
	// loop over the array and count the number of letter that are not vowels

	String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";

	String[] lettersArray = letters.split(",");
	int numberOfLetters = 0;

	// String[] stringAlphaArray = new String[25];

	{
		for (int pos = 0; pos <= lettersArray.length; pos++) {

			if (lettersArray[pos].equals("a")) {
				continue;
			} else if (lettersArray[pos].equals("e")) {
				continue;
			} else if (lettersArray[pos].equals("i")) {
				continue;
			} else if (lettersArray[pos].equals("o")) {
				continue;
			} else if (lettersArray[pos].equals("u")) {
				continue;
			}

			numberOfLetters = numberOfLetters + 1;
		}
		System.out.println("Number of letter = " + numberOfLetters);

		// used an enhanced loop and much less code
		String vowels = "aeiou";

		int numberOfLettersEnhanced = 0;
		//instead of letterArray could shortcut and put letters.split(",")instead of creating another variable
		for (String letter : lettersArray) {
			if (!vowels.contains(letter)) {
				numberOfLettersEnhanced = numberOfLettersEnhanced + 1;
			}
		}

		System.out.println("Number of letter = " + numberOfLettersEnhanced);
	}
}
