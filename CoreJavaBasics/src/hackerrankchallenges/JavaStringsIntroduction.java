package hackerrankchallenges;

public class JavaStringsIntroduction {

	public static void main(String[] args) {

		String A = "hello";
		String B = "java";
		System.out.println(A.length() + B.length());

		int z = A.compareTo(B);

		if (z > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		String firstletter = A.substring(0, 1).toUpperCase() + A.substring(1);
		String restofletters = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(firstletter + " " + restofletters);

	}

}