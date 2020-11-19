package collections;

import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
	Vector v=new Vector();
	v.add("Hi");
	v.add("Bye");
	v.add('A');
	v.add('B');
	v.add(123);
	v.add(23.456);
	v.add("Bye");
	v.add('A');
	v.add('B');
	
	
	
	System.out.println("The count of the collection "+v.size());
	for(int i=0;i<v.size();i++) {
		System.out.println(v.get(i));
	}
	System.out.println("The capacity of the vector is "+v.capacity());

	}

}
