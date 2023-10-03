package loops;

public class SBAWorkspace {

	public static int getDigitsSum(int largeNumber) {
	
		int getDigitsSum;
		
		for (getDigitsSum = 0; largeNumber != 0; largeNumber/= 10) {
			getDigitsSum += largeNumber % 10;
		}
		System.out.println(getDigitsSum);
		return (getDigitsSum(0));
		
	}

}
