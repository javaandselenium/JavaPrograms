
public class C extends B {
	public void mul()
	{
		System.out.println("priniting mulfrom C class");
	}
	public static void main(String[] args) {
	
	B a=new C();
	a.add();
	a.sub();
	
	C c=(C)a;
	c.add();
	c.sub();
	c.mul();
	

}
}