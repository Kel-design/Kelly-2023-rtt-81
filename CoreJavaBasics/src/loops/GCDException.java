package loops;

public class GCDException extends Exception {
	private String str1;
	
	GCDException(String str2) {
		this.str1=str2;
	}
	
	public String toString() {
		return ("---->GCDException Occurred: "+str1);
		
	}

}
