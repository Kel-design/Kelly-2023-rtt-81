package loops;

public class SBAPracticeTrial2 {

	public static void main(String[] args) {
		int x = 8763;
		int sum = 0;
		while (x == 0) {
			x = x / 10;
			sum += x % 10;
			
			System.out.print(sum);
		}

	}
}
