package pa30371arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Task8 {

	public static void main(String[] args) {
		//int[] myNumbers = { 3, 8, 22, 9, 17 };
		
		//System.out.println("Before swap the array list" + myNumbers);
		
		//Collections.swap(myNumbers, 0, 4); swap feature only for Strings??
		
		//System.out.println("After swap the array list" + myNumbers);
		//Solution:
			
		String [] strings = {"1", "2", "3", "4", "5" };
		
		Arrays.toString(strings);
		
		String temp = strings[0]; //make temp spot for 1
		strings[0] = strings[2]; //put middle 3 into position 3
		System.out.println(Arrays.toString(strings));
		
		strings[2] = temp; //take temp variable into the middle postion
		
		System.out.println(Arrays.toString(strings));
	}

}
