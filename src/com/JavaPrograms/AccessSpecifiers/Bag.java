package com.JavaPrograms.AccessSpecifiers;

public class Bag {
	protected int a=10;
	
	protected  void mul()
	{
		System.out.println("mul");
	}

	protected Bag()
	{
		System.out.println("protected constructor");
	}
	public static void main(String[] args) {
		Bag b=new Bag();
		System.out.println(b.a);
		b.mul();
		

	}

}
