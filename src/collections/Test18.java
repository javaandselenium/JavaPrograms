package collections;

import java.util.LinkedList;

public class Test18 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(78);
		list.add(45);
		list.add(90);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
	}

}
