package constructor;

public class Test4 {
	String name="john";
	
	public  Test4()
	{
		String name="johnny";
		System.out.println(name);
	}

	public static void main(String[] args) {
		Test4 t=new Test4();
		System.out.println(t.name);
		
	
		

	}

}
