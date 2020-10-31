package inhertiance;

public class AdvanceCal extends BasicCal {
	public static void sinteta() {
		System.out.println("sinteta");
	}

	public static void coseteta() {
		System.out.println("coseteta");
	}

	public static void main(String[] args) {
		AdvanceCal.sinteta();
		AdvanceCal.coseteta();
		AdvanceCal.add(10, 20);
		AdvanceCal.sub(10, 5);
		AdvanceCal.mul(3, 5);

	}

}
