package glab303111genericmethodandclass;

public class MyRunner {

	public static void main(String[] args) {
		DemoClass dObj = new DemoClass();
		dObj.genericsMethod(25); // passing int
		dObj.genericsMethod("Per Scholas"); // passing String
		dObj.genericsMethod(2563.5); // passing float
		dObj.genericsMethod('H');//passing Char

	}

}
