package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Test3 {

	public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue();
	p.add(300);
	p.add(1);
	p.add(20);
	p.add(400);
	p.add(20);
	
	LinkedList l=new LinkedList<>();
	l.add(300);
	l.add(1);
	l.add(20);
	l.add(400);
	l.add(20);
	System.out.println(l);
	
	System.out.println(p);
	}

}
