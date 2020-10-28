package methods;

public class Test1 {
	static String name = "Ram";
	static String bankname = "Xyz";
	static int balance = 1000;
	static int withdrawamt = 500;

	public static void withdrawal() {
		int bal = balance - withdrawamt;
		System.out.println(bal);
	}

	public static void main(String[] args) {
		withdrawal();

	}

}
