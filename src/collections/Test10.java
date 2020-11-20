package collections;

import java.util.TreeMap;

public class Test10 {

	public static void main(String[] args) {
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
         t.put("Ram",123);
         t.put("Ham",567);
         t.put("Jam",567);
         t.put("Tam",890);
         System.out.println(t);
         System.out.println(t.keySet());
         System.out.println(t.values());
	}

}
