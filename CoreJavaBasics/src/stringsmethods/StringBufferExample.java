package stringsmethods;

public class StringBufferExample {

	public static void main(String[] args) {
		String x = "abcxyz";
		String x1 = x.substring(0,3) + "123" + x.substring(3);
		
		// "abc" + "123" + "xyz"
		// then it makes another string of "abc123xyz" that it assigns to x
		//buffer.insert(3, "123");
		
		// change x from abc123xyz to abcxyz
		// it would take long code
		
		String y = x.toUpperCase();
		
		
		// EASIER TO USE BUFFERS
		StringBuffer buffer = new StringBuffer();
		buffer.append("abc");
		buffer.append("xyz");
		
		//zyxbca
		
		buffer.reverse();
		
		// buffer substring does the same as String substring
		String sub = buffer.substring(0, 3);
		
		// you can insert into the string buffer anywhere (at position zero, 
		//it added 123 to the beginning of the array)
		buffer.insert(0, "123");
		
		// remove from string buffer start at 3 and delete up until, but not including 6
		buffer.delete(3, 6);
		
		// replace some characters in the string buffer
		StringBuffer sT = new StringBuffer("Java");
		sT.replace(0,  2, "Hello");
		System.out.println(sT);
		
		
		System.out.println(buffer.toString());

	}

}
