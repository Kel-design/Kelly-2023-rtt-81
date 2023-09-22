package com.perscholas.java_basics;

public class StringExamples {

	public static void main(String[] args) {
		String s1 = "welcome";

		String s2 = new String("welcome");
		
		
		//these are not the same
		//this is actually a string in memore that 0 characters adn lentgth of 0
		String empty = "";
		
		//this is a string that has not been allocated in memory yet
		String nullstring = null; 
		
		nullstring = new String ("now its in memory");

		// this is all ok with primitives
		int x = 5;
		int y = 6;
		if (x == y) {

		}

		// can not ever use == with strings
		// Must always use .equals
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("The strings are equal");
		} else {
			System.out.println("The strings are not equal");
		}
		
		if ( s1.toLowerCase() .equals(s2.toLowerCase())) {
		String upper = s1.toUpperCase();
		String lower = s1.toLowerCase();
		
		
		//make all of the lowercase e into E (String replaceAll)
		String s = new String("welcome");
		s = s.replaceAll("e", "E");
		System.out.println(s);
		
		
		//what's the difference between 0 and 4 ...... 1 and 5 in postitioning
		String pos = "abcdefghij";
		// 		pos   0123456789
		int len = pos.length();
		
	
		
		}
		
		

	}

}
