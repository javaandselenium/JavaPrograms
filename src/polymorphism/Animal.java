package polymorphism;

public class Animal {
	public void eat1() {
		System.out.println("eating");
	}
}

class Cow extends Animal{
	public void eat()
	{
		System.out.println("eating grass");
	}
}

class Lion extends Animal{
	public void eat() {
		System.out.println("eating meat");
	}
}

class Dear extends Animal{
	public void eat()
	{
		System.out.println("eating meat and grass ");
	}
}
