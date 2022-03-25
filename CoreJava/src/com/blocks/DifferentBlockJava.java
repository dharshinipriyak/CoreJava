package com.blocks;

//Different Blocks
//main, costructor, static, method, normal block

public class DifferentBlockJava {

	static {
		System.out.println("static executes before main");
	}
	//normal block executes before constructors
	{
		System.out.println("normal block");
		System.out.println("normal block will executes on object creation before constructor");
	}
	DifferentBlockJava(){
		System.out.println("Constructor block");
	}
	public static void main(String[] args) {
		System.out.println("MainBlock");
		DifferentBlockJava ob=new DifferentBlockJava();
	}

}
