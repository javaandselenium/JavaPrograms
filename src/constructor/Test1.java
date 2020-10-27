package constructor;

public class Test1 {

	public Test1() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

	}

	public void sub() {
		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.sub();

	}

}
