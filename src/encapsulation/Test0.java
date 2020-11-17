package encapsulation;

public class Test0 {

	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.getPwd());
		d.setPwd(5678);
		System.out.println("after resettting");
		System.out.println(d.getPwd());
		

	}

}
