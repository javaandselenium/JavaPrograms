package exceptionHandling;

public class Test3 {

	public static void main(String[] args) {
		try {
		int i=1/0;
		}
		catch(Exception e) {
			System.out.println("handle");
		}
			int a[]=new int[3];
			a[0]=10;
			a[1]=20;
			a[2]=30;
			try {
			a[3]=40;}
		
	finally {
		System.out.println("array");
	}
	}}	

	


