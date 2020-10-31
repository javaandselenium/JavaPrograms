package inhertiance;

public class Parents extends GrandFather {
	public static void bike() {
		System.out.println("parents bike");
	}

	public static void main(String[] args) {
		Parents.bike();
		Parents.car();
		Parents.villa();
	}

}
