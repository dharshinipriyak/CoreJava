package com.edu.corejva;
//Constructor calling from child to parent class
//function overriding
class ParentA{
	final int ACC=555; //we cannot override ,cannot make changes,we can inherit
	private int sal;
	 public ParentA(){
		System.out.println("Parent class constructor");
	}
	 public ParentA(int sal) {
		 this.sal=sal;
		 System.out.println("Salary="+sal);
	 }
	 void display() {
		 System.out.println("Parent display");
	 }
}
class ChildC extends ParentA{
	public ChildC(){
		System.out.println("Child class constructor");
	}
	public ChildC(int sal) {
		super(sal);//call super class constructor , it should be the first line
		System.out.println("other statements");
		}
	 void display() {
		System.out.println("child display");
		super.display();
	}
	
}
public class  OverRidingprog{

	public static void main(String[] args) {
		//Parent ob=new Parent();
		ChildC ob1=new ChildC(); 
		ChildC ob2=new ChildC(456);
		ob2.display();
	}
}

