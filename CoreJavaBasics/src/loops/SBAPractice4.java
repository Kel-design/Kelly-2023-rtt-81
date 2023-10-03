package loops;

public class SBAPractice4 {

	public static void main(String[] args) {
		double number = 5420.95;
		int n = (int) (number);
		int sumOfDigits;
	    for(sumOfDigits = 0 ; n!=0 ; n/=10) {
	        sumOfDigits += n%10; // adding remainder(last digit) to the sum
	    }
	    System.out.println(sumOfDigits);


	}

}
