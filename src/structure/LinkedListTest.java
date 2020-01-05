package structure;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Comparable> ab = new LinkedList();
		
		ab.add("abcd");
		ab.add(1, 123);
		ab.addLast('c');
		ab.addFirst("shubham");
		ab.offerLast("kkkkk");
		System.out.println(ab);

	}

}
