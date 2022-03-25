package com.innerclassconcept;
//class inside another class(inner class)
class OuterClass{
	int i=5;
	private class Innerclass{
		int variable;
		public Innerclass() {
			variable=19;
		}
	void method_inner() {
		System.out.println("Innerclass method"+variable);
		System.out.println("outerclass method "+i);
	}
		
	}//inner class ends
	void method_outer() {
		Innerclass ob=new Innerclass();
		ob.method_inner();
	}
}
public class InnerClasstype{
	public static void main(String[] args) {
		OuterClass ob=new OuterClass();
		ob.method_outer();
	}
}
