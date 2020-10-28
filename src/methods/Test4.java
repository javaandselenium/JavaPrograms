package methods;

public class Test4 {
	static int a = 10;
	int b = 20;

	public static void abc() {
		System.out.println("executed static method");
	}

	public void xyz()

	{
		System.out.println("execueted non static method");
	}

	public static void main(String[] args) {
		System.out.println(Test4.a);
		Test4.abc();

		Test4 t = new Test4();
		System.out.println(t.b);
		t.xyz();

	}

}
