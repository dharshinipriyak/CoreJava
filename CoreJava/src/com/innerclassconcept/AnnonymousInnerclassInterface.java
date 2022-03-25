package com.innerclassconcept;
interface Myinterface{
	void add();
	void sub();
}
public class AnnonymousInnerclassInterface {
public static void main(String[] args) {
	//local inner annonymous class
	Myinterface mi=new Myinterface() {
		
		@Override
		public void sub() {
			System.out.println("Interface add");
			
		}
		
		@Override
		public void add() {
			System.out.println("Interface sub");
			
		}
	};
	mi.add();
	mi.sub();
}
}
