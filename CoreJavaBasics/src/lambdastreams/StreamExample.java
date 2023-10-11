package lambdastreams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();

		names.add("Larry");
		names.add("Steve");
		names.add("James");
		names.add("Conan");
		names.add("Ellen");

		// enhanced for loop EASIER to understand and type
		for (String name : names) {
			System.out.println(name);
		}
		// using a list as a stream to do a for loop
		names.forEach(name -> {
			System.out.println(name);
		});
		
		
		
		
		// this is better than using a loop to delete item(s) from a list or find item(s)
		// this would take away all names that start with an L
		names.removeIf(name -> !name.startsWith("L"));
		
		

	}

}
