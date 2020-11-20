package collections;

import java.util.LinkedHashMap;

public class Test12 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> t=new LinkedHashMap<>();
		t.put("Ram", 123);
		t.put("Ham", 567);
		t.put("Jam", 567);
		t.put("Tam", 890);
		System.out.println(t);


	}

}
