package practiceassignmentloops;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		int row;
		int column;
		for (row = 1; row <= 12; row++) {

			for (column = 1; column <= 12; column++) {
				System.out.println(row*column + " ");
			}
			System.out.println();
		}

	}

}
