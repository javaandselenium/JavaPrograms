package methods;

public class ReturnTypes {
	//without parameter
	public int add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	public double sub(double x,double y) {
		double z=x-y;
	System.out.println(z);
		return z;
	}
	

	public static void main(String[] args) {
		ReturnTypes r=new ReturnTypes();
		int result = r.add();
		 double subres = r.sub(10.98, 5.00);
System.out.println(result+"addition output");
	}

}
