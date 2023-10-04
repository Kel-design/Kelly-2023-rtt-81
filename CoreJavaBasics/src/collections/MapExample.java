package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		HashMap<String, List<String>> dictionary;
		
		List<Map<String,Object>> rowInADatabase;
		
		
		//Map is parent class ... HashMap is the implementation... 
		//String is the Key and the and Integer is the value 
		Map<String, Integer> stringMap = new HashMap<>();

		stringMap.put("one", 1);
		stringMap.put("two", 2);

		Integer one = stringMap.get("one");
		Integer two = stringMap.get("two");

		System.out.println(stringMap.get("one"));
		System.out.println(stringMap.get("two"));

		stringMap.put("one", 1000);

		System.out.println(stringMap.get("one"));

		Map<String, String> strings = new HashMap<>();
		
		strings.put("one", "This is a single item");
		strings.put("two", "This is two things");

		// hash maps allow nulls
		Map<Integer, String> numbers = new HashMap<>();
		numbers.put(1, "1st");
		numbers.put(2, "2nd");
		numbers.put(3, "3rd");
		numbers.put(4, "4th");
		numbers.put(40, "4th");
		numbers.put(50, null);
		numbers.put(null, "null");
		//put something in twice it will override the value.
		//can only have 1 type of key, but value can repeat

		System.out.println("=====================");

		// looping over a map we must loop over the set of keys
		// using an integer because Key is an integer
		//
		for (Integer key : numbers.keySet()) {

			// we have to use the key to look up the value

			// use the names "value" and "key" when assigning so they make sense for human
			// brain.
			String value = numbers.get(key);
			System.out.println(key + "=" + numbers.get(key));

		}

	}

}
