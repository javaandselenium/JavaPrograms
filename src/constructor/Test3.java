package constructor;

public class Test3 {
	
	public Test3(int a)
	{
		System.out.println("running numbers");
	}
	
	public Test3(int b ,String s)
	{
		System.out.println("running numbers and caraters");
	}
	
	public Test3(int a,double d)
	{
		System.out.println("running integers and double values");
	}
	
	public Test3(double d,int a)
	{
		System.out.println("running double and integer values");
	}
	public static void main(String[] args) {
		Test3 t=new Test3(3,4.989);
		Test3 t1=new Test3(89);
		
	}

}
