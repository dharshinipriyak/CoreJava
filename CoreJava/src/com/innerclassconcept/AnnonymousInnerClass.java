package com.innerclassconcept;
abstract class MyAbstract{
	public abstract void add();
	public abstract void sub();
	void display() {
		System.out.println("Display Method");
	}
}
public class AnnonymousInnerClass {
	public static void main(String[] args) {
		MyAbstract obj=new MyAbstract() {

			@Override
			public void add() {
				System.out.println("Add Method");

			}

			@Override
			public void sub() {
				System.out.println("Sub method");

			}

		};
		obj.add();
		obj.sub();
		obj.display();
}
}

	/*
	 * abstract class MyAbstract{
	public abstract void add();
	public abstract void sub();
}

public class AnnonymousInnerClass {

	public static void main(String[] args) {
		//Annonymous inner class
		//can be applied to abstract class or interface
		MyAbstract ob=new MyAbstract() {

			@Override
			public void add() {
				System.out.println("Add method");

			}

			@Override
			public void sub() {
				System.out.println("Subtract method");

			}

		};
		ob.add();
		ob.sub();


	}

}

	 */