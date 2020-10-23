package methods;

public class Test3 {
	
	public static void areaofcircle(double pi,int r)
	{
		double result=pi*r*r;
		System.out.println("The area of the circle is "+result);
	}
	
	public static void main(String[] args) {
		areaofcircle(3.142,5);
	}

}