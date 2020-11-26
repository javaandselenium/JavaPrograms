package strings;

public class Test4 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("SELENIUMSELENIUMSELENIUM");
		System.out.println(s.reverse());
		System.out.println(s.charAt(5));
		System.out.println(s.insert(0,"Hello"));
		System.out.println(s.delete(0,5));
		System.out.println(s.append("Java"));
		System.out.println(s.capacity());
		
		
		StringBuilder b=new StringBuilder("HELLO JAVA");
		System.out.println(b.reverse());

	}

}
