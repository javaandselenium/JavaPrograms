package methods;

public class Test2 {

	public static void add(int a, double b) {
		double c = a + b;
		System.out.println(c);
	}

	public static void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		add(8, 3.75);
		sub(10, 5);
	}

}
