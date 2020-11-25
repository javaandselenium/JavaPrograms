package strings;

public class Test1 {

	public static void main(String[] args) {
		String s=" I LOVE JAVA ";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('A'));
		System.out.println(s.lastIndexOf('A'));
		System.out.println(s.lastIndexOf('J',3));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,6));
		System.out.println(s.trim());
		

	}

}
