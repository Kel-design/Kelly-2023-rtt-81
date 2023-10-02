package loops;

public class BreakExample {
	
	//1 	* 10= 10
	//10 	* 10= 100
	//100	* 10=1000
	//1000	* 10=10000
	//1000	/ 10=100
	//100 	/ 10=10
	//10	/ 10 =1 
	//1		/ 10= 0.1
	
	
	// to figure the length of 8763 which 4 b/c there are 4 digits
	//8763 / 10 =876.3
	//truncate it
	//876 / 10 = 87.6
	//truncate again
	//87 / 10 = 8.7
	//truncate again
	//8 / 10 = 0
	
	
	
	//when you multiply by 10 you move the decimal place to the right 

	public static void main(String[] args) {

		int sum = 0;
		int number = 0;

		while (number < 20) {
			number++;
			sum += number;

			if (sum >= 40) {
				break;
			}

			System.out.println("This code will not execute after the break");
		}

		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);

	}

}
