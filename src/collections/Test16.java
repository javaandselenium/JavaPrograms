package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test16 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Apple");
		a.add("Orange");
		a.add("Banana");
		a.add("Papaya");
		System.out.println("Before swapping");
		System.out.println(a);
		Collections.swap(a, 1, a.size() - 2);
		System.out.println("after swapping");
		System.out.println(a);

	}

}
