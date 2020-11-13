package interfaceprograms;

public class B extends A implements Parent1,Parent2{
	
	public void b()
	{
		System.out.println("b from class B");
	}
	
	@Override
	public void home() {
		System.out.println("home");
		
	}
	
	@Override
	public void car() {
		System.out.println("car");
		
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.a();
		b.b();
		b.home();
		b.car();
	}

	
	

	
	

}
