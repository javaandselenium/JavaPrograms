package collections;

import java.util.PriorityQueue;

public class Test5 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(300);
		p.add(40);
		p.add(20);
		p.add(70);
		p.add(10);
		p.add(20);
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println("After using peek method "+p);

	}

}
