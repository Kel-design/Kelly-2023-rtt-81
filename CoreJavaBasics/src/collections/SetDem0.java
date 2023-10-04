package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetDem0 {

	public static void main(String[] args) {
		
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("a");
		stringList.add("b");
		stringList.add("c");
		
		
		//string List enables you to get something out of a particular position (in this case 1)
		stringList.get(1);

		Set<String> stringSet = new HashSet<>();
		
		//set does not maintain position... even if it looks like it does... it doesn't
		stringSet.add("c");
		stringSet.add("b");
		stringSet.add("a");
		
		stringSet.add("a");
		
		//stringSet.get doesn't exist. Can not get by position from a set. 
		//Mainly b/c the Set doesn't have assigned positions
	

		for (String string : stringSet) {
			System.out.println(string);
		}
		
	
		
		
		

	}
}
