package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test20 {

	public static void main(String[] args) {
		Set<Integer>h=new HashSet<Integer>();
		h.add(20);
		h.add(40);
		h.add(60);
		h.add(80);
		h.add(20);
		System.out.println(h);
		
		HashSet<Integer>h1=new HashSet<Integer>(h);
		h1.add(100);
		h1.add(200);
		System.out.println(h1);
		

	}

}
