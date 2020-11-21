package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test14 {

	public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(50);
	a.add(10);
	a.add(40);
	a.add(30);
	System.out.println("Before shuffling");
	
	for(int i:a) {
		System.out.println(i);
	}
	
	Collections.shuffle(a);
	System.out.println("After shuffling");
	
	for(int i:a) {
		System.out.println(i);
	}
	
	
	
	
	

	}

}
