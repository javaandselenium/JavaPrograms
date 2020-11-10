package polymorphism;

public class Mainclass {

	public static void main(String[] args) {
		Animal a;
	a=new Dear();
	a.eat1();
	a=new Cow();
	a.eat1();
	a=new Lion();
	a.eat1();

	}

}
