package stringsmethods;

import java.util.Arrays;

public class JavaStringsSplitMethod {

	public static void main(String[] args) {
		String vowels = "a::b::c::d:e";
		
		String[] result = vowels.split("::");
		
		System.out.println("result = " + Arrays.toString(result));
		
		String csv ="a,b,c,d,e,f,g,h,i,j,k";
		String[] commas = csv.split(",");
		System.out.println("result = " + Arrays.toString(commas));
	
		//Firstname Lastname
		//split that into firstname and lastname
		// using " " with a space to create a space
		
		String name = "Firstname Lastname";
		String[] names = name.split (" ");
		System.out.println("result = " + Arrays.toString(names));
		
		
		
	}
	
	

}
