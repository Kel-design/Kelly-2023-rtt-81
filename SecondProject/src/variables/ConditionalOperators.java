package variables;

public class ConditionalOperators {

	public static void main(String[] args) {

		boolean conditionOne = false;
		boolean conditionTwo = false;

		if (conditionOne && conditionTwo) {
			// do something only if both variables are true
			System.out.println("Both variable are true");
		}
		if (conditionOne || conditionTwo) {
			// do something if one or the other or both variable are true
			System.out.println("Either or both of the variables is true");

		}
		// neither is true
		if (!conditionOne && !conditionTwo) {
			System.out.println("neither is true");
		}

		// this is using mathmatical operators
		int x = 10;
		if ((x > 3) && (x < 20)) {
			System.out.println("x is between 3 and 20");

			// odd vs even
			// this is using modulus
			int y = 4;
			if ((y % 2) == 1) {
				System.out.println("This is an odd number");
			} else {
				System.out.println("This is an even number");

			}
		}
	}

}
