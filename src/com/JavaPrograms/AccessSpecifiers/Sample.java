package com.JavaPrograms.AccessSpecifiers;

public class Sample {
	int a=10;
	
	void abc()
	{
		System.out.println("abc");
	}
	
	Sample()
	{
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.a);
		s.abc();
		Bag b=new Bag();
		System.out.println(b.a);
		b.mul();

	}

}
