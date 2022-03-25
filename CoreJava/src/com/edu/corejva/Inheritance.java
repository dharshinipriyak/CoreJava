// qwertyuiopP asdfghjkl zxcvbnm , . " { } [] - ( ) ; '  ' " 0 \

package com.edu.corejva;

import java.util.Scanner;
class Parent{
	private int sal; //data accessed with in class , scope is with in class
	public String name;
	protected int age;
	String accno;
 void input() {
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter salary");
		sal=sc.nextInt();
		System.out.println("Enter Accno");
		accno=sc.next();
		System.out.println("Enter name");
		name=sc.next();
		sc.close();
	}
	void printSal() //by using function we can give permission to access the private data by child class
	{
		System.out.println("Salary="+sal);
	}
}
class Child extends Parent{ //dependent class
	
	void display() {
		//System.out.println("sal ="+sal); //private not accesseble
		System.out.println("Name   ="+name);
		System.out.println("Age    ="+age);
		System.out.println("Accno  ="+accno);
	}
}
public class Inheritance{  //indepent class

	public static void main(String[] args) {
		
		Child ob=new Child();
		ob.input();
		ob.display();
		ob.printSal();
		
	}

}
