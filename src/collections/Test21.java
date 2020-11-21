package collections;

import java.util.HashSet;
import java.util.Set;

public class Test21 {

	public static void main(String[] args) {
		HashSet<Integer>h=new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		
		HashSet<Integer>h1=new HashSet<Integer>();
		h1.add(100);
		h1.add(20);
		h1.add(30);
		h1.add(400);
		h1.add(50);
		
		System.out.println(h1.hashCode()==h.hashCode());
		System.out.println(h1.retainAll(h));
		
		for(Integer i:h1) {
			System.out.println(i);
		}

	}

}
