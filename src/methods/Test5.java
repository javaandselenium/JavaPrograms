package methods;

public class Test5 {
	public void send(int no)
	{
		System.out.println("sending numbers");
	}
	
	public void send(int no,String msg)
	{
		System.out.println("sending numbers and msg");
	}
	
	public void send(double contact,String document,int no)
	{
		System.out.println("sending contatcts,doc, numbers");	
	}
	
	public void send(int no,double contact,String document)
	{
		System.out.println("sending numbers,contact,doc");
	}
	
	
public static void main(String[] args) {
		
Test5 t=new Test5();
t.send(123,"hi");
t.send(5765767,"styfty",6468);

	}

}
