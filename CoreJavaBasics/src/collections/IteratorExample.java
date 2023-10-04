package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {

		// pos 012345
		// val abcdef

		ArrayList<String> strings = new ArrayList<>();

		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		strings.add("e");
		strings.add("f");

		
		//use this type of for loop to iterate over an ArrayList
		// for string in strings
		for (String string : strings) {
			System.out.println(string);
		}

		System.out.println("===============");
		
		//doing the same thing as the above for loop, but not user friendly
		Iterator<String> itr = strings.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}

	}
}
