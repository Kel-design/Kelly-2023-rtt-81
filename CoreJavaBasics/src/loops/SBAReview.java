package loops;

public class SBAReview {

	public static void main(String[] args) {
		//when we multiply a number by 10 it moves the decimal point right
		
		//1 	* 10= 10
		//10 	* 10= 100
		//100	* 10=1000
		//1000	* 10=10000
		
		//when we divide by 10 ... it moves the decimal point left
		//1000	/ 10=100
		//100 	/ 10=10
		//10	/ 10=1 
		//1		/ 10=0.1
		
		//looking the number of times 10 goes into and the remainder
		
		//This IS USING int primitive (x) to automatically truncate the result
		
		// to figure the length of 8763 which 4 b/c there are 4 digits
		//8763 	/ 10 = 876.3 //truncate it
		//876 	/ 10 = 87.6 //truncate again
		//87 	/ 10 = 8.7 //truncate again
		//8 	/ 10 = 0 // while (x == 0) you know you hit the end (my break; exit condition)
		
		// dividing by 10 removes the number on right
		
		//WHILE LOOP
		
		// archie idea: Count = 0; while(x >0) { x %= 10; count++; x /=10}return count
		
		int x = 8763;
		while (x == 0) {
		
		x = x / 10;
		
		//sum of mod!!!! work on this TONIGHT!
		
		//for our case assume that a modulus will always be a positive whole number int
		//modulus  by 10 gives you the number on the right
		//8763 	% 10 = 3
		//876	% 10 = 6
		//87	% 10 = 7
		//8		% 10 = 8
		
		// 8 % 10 = 8 because 8/10= 0 with a remainder of 8
		
		int x1 = 8763 / 10; // this gets us the whole number by using the integer
		//and dividing the number you auto throw out the remainder
		x1 = x1 / 10;
		int y = 8763 % 10; // answer is 3 (remainder is 3 b/c 876.3)
		
		String[] stringArray = new String[10];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[9] = "nine";
		
		
		
		// write a for loop that tells me the location of the first null in the array
				// this is going to use the non-enhance for loop
		
		//
		int firstNull = -1;
		for (int pos = 0; pos < stringArray.length; pos++) {
			if (stringArray[pos] == null) {
				firstNull = pos;
				break;
				
			}
		
		
	}
		
		// write a for loop that tells me the last position of null in the array
				// this is an old style for loop with an array location
				// by last null position we mean the position with the highest value
				int lastNull = -1; // asserting b/c it's not part of the array
				for (int pos = 0; pos < stringArray.length; pos++) {
					if (stringArray[pos] == null) {
						lastNull = pos;
						
						//this lastNull position overrides itself as it runs through the loop
					}

				
	}}}}
