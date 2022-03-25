package com.abstractkeyword;

//abstract: class and method
//if you do not want object to be created then declare class as abstract
//for any method in the class if you are not implementing the declare method abstract
//if any method is abstract, the compiler says declare class also abstract
//if any abstract class, then inheritance is a must
abstract class Area {
	abstract void calArea();
	Area(){
		System.out.println("Abstract class can have constructor");
	}
	void displ() {
		System.out.println("Method with the body");
	}
}

class Reactangle extends Area{

	@Override
	void calArea() {
		int l=9;
		int b=7;
		int area=l*b;
		System.out.println("area of reactangle="+area);
	}
}
public class Abstraction {

	public static void main(String[] args) {
		//Area ob=new Area();//abstract class cannot be instantiated
		Reactangle ob=new Reactangle();
		ob.calArea();

	}

}
