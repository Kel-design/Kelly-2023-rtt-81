package stringsmethods;

public class SubstringDemo {

	public static void main(String[] args) {

		// --------------0123456789012345
		String string = "This is a string";

		// substring with a start and an end
		String sub = string.substring(5, 7);
		System.out.println(sub);

		// substring with just a start (takes everything from that position to the end)
		String sub1 = string.substring(5);
		System.out.println(sub1);

		// -----------------0123456789012 (last index of "." gets you to dot
		// and then you want to print out the next thing in string (+1)
		String filename = "someimage.jpg";
		int lastDot = filename.lastIndexOf(".");

		String ext = filename.substring(filename.lastIndexOf(".") + 1);
		System.out.println(ext);

		// Finding first name by specifying the space
		// -------------01234567890
		String name = "Eric Heilig";

		int spacePosition = name.indexOf(" ");
		String firstname = name.substring(0, spacePosition);
		System.out.println(firstname);

		String lastname = name.substring(name.indexOf(" ") + 1);
		System.out.println(lastname);
//-------------------------------------------------------------------------------------------------
		// 1.find the position of the first space in the string

		String example = "This is an example";
		int spaceFirstLocation = example.indexOf(" ");
		String spacefirstexample = example.substring(0, spacePosition);
		System.out.println("First space in string is at :" + spaceFirstLocation);

		// 2.find the position of the last space in the string

		int spaceLastLocation = example.lastIndexOf(" ");
		String spacelastexample = example.substring(0, spaceLastLocation);
		System.out.println("Last space in string is at  :" + spaceLastLocation);

		// 3.substring of the character between the first and last space of the string

		String inbetween = example.substring(spaceFirstLocation, spaceLastLocation);
		System.out.println("The characters between the first and last spaces are : " + inbetween);

		// 4.do the same thing to find the substring of the first and last vowel of the
		// string KELLY FIX THIS ONE!

		String vowels = "aeiou";
		// int firstVowelLocation = example.indexOf("a","e","i","o","u");
		// int lastVowelLocation = example.lastIndexOf("vowels");
		// String betweenvowels = example.substring(firstVowelLocation,
		// lastVowelLocation);
		// System.out.println("The characters between the first and last vowels are : "
		// + betweenvowels);

		// 5.using only indexOf(" ")print the substring that contains the word "is"
		// This requires the use of 2 substrings to do this.

		example = example.substring((example.indexOf(" ") + 1), example.lastIndexOf("is") + 2);
		System.out.println(example);

		// https://edabit.com/challenges
		// Change to Java / Very Easy / Strings and try to do some

		// 6.Use the string.charAt function and use a for loop to loop over the entire
		// string
		// and print out each character with a new line after it.
		// you need to use the string.length() function also HINT: go from 0 to length
		// of string and
		// asking for string.charAt

		String anotherexample = "This is an example";
		int i = -1;
		for (i = 0; i > anotherexample.length(); i++) {
		System.out.println(anotherexample.charAt(0));}
		// how to print out more than one and cause it to loop...
	}

	private static int endsWith(String example) {
		// TODO Auto-generated method stub
		return 0;
	}

}
