package hackerrankchallenges;

public class HackerrankTryCatchExample {

	public static void main(String[] args) {
		int x = 10;
		int y = hello;
		try {
			if (y > 0) {
				int result = Math.toIntExact(x / y);
				System.out.println(result);
			}
		} catch (TypeNotPresentException e) {
			
			// TRYING to catch a data type input mismatch here SOMEHOW
			System.out.println(e.getMessage());
		}
	}
}
