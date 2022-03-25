package com.innerclassconcept;
//class inside outerclass method
class Outer{
	void method()
	{
		System.out.println("Outer method");
		class Inner{
			void innermethod() {
				System.out.println("inner method");
			}
		}
		Inner iobj=new Inner();
		iobj.innermethod();
	}
}
public class MethodLocalInnerClass {
public static void main(String[] args) {
	Outer obj=new Outer();
	obj.method();
}
}
