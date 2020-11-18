package collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(12.89);
		a.add("Java");
		a.add('A');
		a.add(true);
		a.add("");
		a.add("Java");
		
//		System.out.println("Removeing the value present in index 3" +a.remove(3));
//		a.remove(true);
		//a.removeAll(a);
//		a.add(3,"Selenium");
//		a.addAll(a);
//		a.addAll(5, a);
		a.remove(3);
		a.retainAll(a);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		//System.out.println("Removeing all the elements "+a.removeAll(a));
		
		
		

	}

}
