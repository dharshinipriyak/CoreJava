
 package com.interfacekeyword;
//What is a interface: blue print of class
//interface is used to achieve multiple inheritance
//one class can implement multiple interface
//ex : class A implements B,C,d
//class can extend only one class and implement any number of interface
//one interface can extend any number of interfaces\
interface Myinterface{
	int i=9;    //public static final int i=9;
	void m1();   //abstract public void m1();
}
class MyClasses implements Myinterface{

	@Override
	public void m1() {
		System.out.println("Implemented class");
		
	}
}
public class Interfaces {

	public static void main(String[] args) {
		MyClasses ob=new MyClasses();
		ob.m1();
	}

}
