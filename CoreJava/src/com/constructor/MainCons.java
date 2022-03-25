package com.constructor;
//Constructor calling from child to parent class
class Parent{
	private int sal;
	 public Parent(){
		System.out.println("Parent class constructor");
	}
	 public Parent(int sal) {
		 this.sal=sal;
		 System.out.println("Salary="+sal);
	 }
}
class Child extends Parent{
	public Child(){
		System.out.println("Child class constructor");
	}
	public Child(int sal) {
		super(sal);//call super class constructor , it should be the first line
		System.out.println("Any Statement");
		}
}
public class MainCons{

	public static void main(String[] args) {
		//Parent ob=new Parent();
		Child ob1=new Child(); 
		Child ob2=new Child(35999);
	}

}
