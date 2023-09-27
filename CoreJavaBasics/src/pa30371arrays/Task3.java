package pa30371arrays;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		
		String[] sourceArray = { "red", "green", "blue", "yellow" };
		System.out.println(sourceArray.length);
		String[] targetArray = sourceArray.clone();
		
		System.out.println("Source Array; " + Arrays.toString(sourceArray));
		System.out.println("Target Array; " + Arrays.toString(targetArray));
	
	}

}
