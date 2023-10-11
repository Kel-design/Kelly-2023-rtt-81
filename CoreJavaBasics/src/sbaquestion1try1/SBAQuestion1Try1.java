package sbaquestion1try1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class SBAQuestion1Try1 {
	
	

	public void replace(int postion) {
		//array[position] = "";
}

	public void main(String[] args) {

		SBAQuestion1Try1 q1 = new SBAQuestion1Try1();
		q1.run();
	}
	

	void run() {

		String[] array = new String[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = "ten";
		}

		List<String> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
			System.out.println("I have added the string: " + array[i] + " at position " + i);}

		}
		public List<String> filterArray() {
			List<String> newList = new ArrayList<>();
			String[] array = null;
			for (String element : array) {
				if (!element.equals("")) {
					newList.add(element);
				}
				
			}
			return newList;
		

	}
}
