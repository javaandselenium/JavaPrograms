package inhertiance;

public class Child extends Parents {
	public static void cycle() {
		System.out.println("child cycle");
	}

	public static void main(String[] args) {
		Child.cycle();
		Child.bike();
		Child.car();
		Child.villa();
	}

}
