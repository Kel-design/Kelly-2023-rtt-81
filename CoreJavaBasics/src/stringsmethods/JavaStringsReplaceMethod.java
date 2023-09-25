package stringsmethods;

public class JavaStringsReplaceMethod {

	public static void main(String[] args) {
		String str1 = "abc cba";
		
		
		String upper = str1.toUpperCase();

		String str2 = (str1.replace('a', 'z'));
		System.out.println(str2);
		System.out.println(str1.replace('a', 'z'));
		
	
		System.out.println("Lava".replace('L', 'J'));
		System.out.println("Lava".toUpperCase());

		System.out.println("Hello".replace('4', 'J'));

		System.out.println(str1.replace("C++", "Java"));

		System.out.println("aa bb aa zz".replace("aa", "zz"));

		System.out.println("Java".replace("C++", "C"));

	}

}
