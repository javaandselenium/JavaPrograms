package typecasting;

public class HotDrinks extends CoolDrinks{
	public void coffee()
	{
		System.out.println("coffee");
	}
	
	public void tea()
	{
		System.out.println("tea");
	}
	
	public static void main(String[] args) {
		//upcasting
		CoolDrinks c=new HotDrinks();
		
		
		//downcasting
		HotDrinks d=(HotDrinks)c;
		d.coldwater();
		d.juice();
		d.coffee();
		d.tea();
		
		
		
	}

}
