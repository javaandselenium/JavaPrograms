package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(12.89);
		a.add("Java");
		a.add('A');
		a.add(true);
		a.add("");
		a.add("Java");
		System.out.println("The size of the arraylist is "+a.size());
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		

	}

}
