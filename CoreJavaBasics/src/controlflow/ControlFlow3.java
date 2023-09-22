package controlflow;

public class ControlFlow3 {

	public static void main(String[] args) {
		int x = 15;
		if (x < 10) {
			System.out.print("Less than 10");
		} else if ((x > 10) && (x < 20)) {
			System.out.print("Between 10 and 20");
		} else if (x >= 20) {
			System.out.print("Greater than or equal to 20");

		}

	}

}
