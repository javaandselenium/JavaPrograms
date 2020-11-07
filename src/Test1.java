
public class Test1 {
	static
	{
		System.out.println("static");
	}
	
	{
		System.out.println("non static");
	}
	
	Test1(){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Test1 t = new Test1();
		

	}

}
