package com.JavaPrograms.AccessSpecifiers;

public class Demo {
	private static int a=10;
	private static void sub()
	{
		System.out.println("Subtracting");
	}
	
	private Demo()
	{
		System.out.println("demo constructor");
	}

	public static void main(String[] args) {
		Demo.sub();
		System.out.println(Demo.a);
		Demo d=new Demo();
		Sample s=new Sample();
		System.out.println(s.a);
		s.abc();
		

	}

}
