package loops;

public class SBAPractice3 {

	public static void main(String[] args) {
		int n = 5420;
		int sumOfDigits;
	    for(sumOfDigits = 0 ; n!=0 ; n/=10) {
	        sumOfDigits += n%10; // adding remainder(last digit) to the sum
	    }
	    System.out.println(sumOfDigits);

	}

}
