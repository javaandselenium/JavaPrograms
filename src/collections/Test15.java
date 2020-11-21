package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test15 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Orange");
		a.add("Banana");
		a.add("Papaya");
		System.out.println("Before shuffling");
		
		for(String i:a) {
			System.out.println(i);
		}
		
		Collections.shuffle(a);
		System.out.println("After shuffling");
		
		for(String i:a) {
			System.out.println(i);
		}

	}

}
