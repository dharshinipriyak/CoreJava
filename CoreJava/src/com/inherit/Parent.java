package com.inherit;

import java.util.Scanner;

public class Parent{
	private int sal; //data accessed with in class , scope is with in class
	public String name;
	protected int age;
	int accno;
	public void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter salary");
		sal=sc.nextInt();
		System.out.println("Enter Accno");
		accno=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
	}
	void printSal() {
		System.out.println("Salary="+sal);
	}
}

