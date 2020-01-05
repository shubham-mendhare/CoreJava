package structure;

import java.util.Collections;
import java.util.HashMap;

public class HashmapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> ab = new HashMap<Integer, String>();
		
		ab.put(0, "Shubham");
		ab.put(1, "Sanket");
		ab.put(3, "Akash");
		System.out.println(ab.size()+" "+ab+" "+ ab.containsKey(3)+" "+ ab.containsValue("Shubham"));


	}

}
