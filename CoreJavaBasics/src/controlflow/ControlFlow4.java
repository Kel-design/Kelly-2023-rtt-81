package controlflow;

public class ControlFlow4 {

	public static void main(String[] args) {
		int x = 5;
		if ((x < 10) || (x > 20)) {
			System.out.print("Out of range");
		} else if ((x >= 10) & (x <= 20)) {
			System.out.print("In range");

		}

	}

}