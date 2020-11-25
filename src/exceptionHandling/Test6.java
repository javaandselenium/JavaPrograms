package exceptionHandling;

public class Test6 {

	public void demo() {
//		try {
//		int i=1/0;}
//		catch(ArithmeticException e) {
//		System.out.println("handdled");}
	   int i=1/0;
		
	}
	public static void main(String[] args) {
		Test6 t=new Test6();
		try {
		t.demo();
		}
		catch(ArithmeticException a) {
		System.out.println("handled");
	}
		System.out.println("hello");
}
}