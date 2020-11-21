package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test17 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Apple");
		a.add("Orange");
		a.add("Banana");
		a.add("Papaya");
		a.add("Apple");
		a.add("Orange");
		a.add("Cherry");
		//ascending order
		System.out.println("Before sorting "+a);
		Collections.sort(a);
		System.out.println("After sorting "+a);
		//desending order
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("in descendingorder "+a);

	}

}
