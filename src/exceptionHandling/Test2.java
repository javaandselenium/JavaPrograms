package exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		try {
		int i=1/0;}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handled AIOE");
		}
		catch(ArithmeticException a) {
			System.out.println("AE");
		}

	}

}
