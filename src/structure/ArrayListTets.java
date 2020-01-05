package structure;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTets {
	
	public static void main(String[] args) {
		
		ArrayList<Comparable> arr = new ArrayList<Comparable>();
		
		arr.add(123);
		arr.add("abcd");
		arr.add(2, 's');
	
		Iterator<Comparable> a =arr.iterator();	
		
		for(int i =0; i<arr.size();i++) {
		if(a.hasNext()) {
			System.out.println(a.next());
			
		}
		}
			
			
			//System.out.println(arr.get(0)+" "+arr.size()+" "+arr.contains(123));

	}
	
}