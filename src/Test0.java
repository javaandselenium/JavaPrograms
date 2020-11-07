
public class Test0 {
	public static void abc()
	{
		System.out.println("Static method");
	}
	
	public  void xyz()
	{
		System.out.println("non Static method");
	}
	
	public Test0()
	{
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		Test0.abc();
		Test0 t=new Test0();
		t.xyz();
	

	}

}
