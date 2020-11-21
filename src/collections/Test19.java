package collections;

import java.util.TreeSet;

public class Test19 {

	public static void main(String[] args) {
		TreeSet<Character> t=new TreeSet<Character>();
		t.add('A');
		t.add('Z');
		t.add('J');
		t.add('V');
		t.add('Z');
		System.out.println(t);
		System.out.println(t.descendingSet());
	}

}
