package interfaceprograms;

public class Child implements Parent1,Parent2{
	
	public void cycle()
	{
		System.out.println("cycle");
	}

	@Override
	public void car() {
	System.out.println("car from parent 1");
		
	}

	@Override
	public void home() {
		System.out.println("home from parent 2");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.car();
		c.home();
		c.cycle();
	}

}
