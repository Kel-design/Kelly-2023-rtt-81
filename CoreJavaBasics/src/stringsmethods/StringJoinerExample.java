package stringsmethods;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		String[] arr = { "a", "b", "c", "d", "e" };
		
		// In the box was a tire, a saw, a pic
		
		for ( int pos = 0 ; pos < arr.length ; pos++ ) {
			System.out.print(arr[pos]);
			if ( pos < arr.length - 1) {
				System.out.print(",");	
			}
		}
				
			//StringJoiner sj = new StringJoiner(",");
			

	}

}
