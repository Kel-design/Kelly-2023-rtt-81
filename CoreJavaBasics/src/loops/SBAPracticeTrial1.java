package loops;

public class SBAPracticeTrial1 {

	public static void main(String[] args) {
		int n = 123;
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
			System.out.print(sum);

		}

	}

}
