package stringsmethods;

public class JavaStringsReplaceAllMethod {

	public static void main(String[] args) {
		String str1 = "Java123is456fun";

		String regex = "\\d+";
// \\d+ means any number of digits
		// \\D+ means any non number REMINDER LOOK UP REGEX101.COM
		System.out.println(str1.replaceAll(regex, " "));

	}

}
