package polymorphism;

public class Ecommerce {
	public void shopping()
	{
		System.out.println("Shopping app");
	}}

class Flipkart extends Ecommerce{
	public void shopping()
	{
		System.out.println("shopping from flipkart");
	}
}

class Amazon extends Ecommerce{
	public void shopping()
	{
		System.out.println("shopping from Amazon");
	}
}

class Myntra extends Ecommerce{
	public void shopping()
	{
		System.out.println("shopping from Myntra");
	}
}