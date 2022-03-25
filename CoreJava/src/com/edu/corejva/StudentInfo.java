package com.edu.corejva;
import java.util.Scanner;

class Student
{
	//initialize the variable
	int sid;
	String sname;
	double sfees;
	int age;
	void input()
	{
		//input 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id ");
		sid=sc.nextInt();
		System.out.println("Enter Student name ");
		sname=sc.next();
		System.out.println("Enter student fees");
		sfees=sc.nextDouble();
		System.out.println("Enter student age");
		age=sc.nextInt();
		sc.close();
	}
	void display()
	{
		
		System.out.println("***Student Information***");
		System.out.println("Id         ="+sid);
		System.out.println("Name       ="+sname);
		System.out.println("Fees       ="+sfees);
		System.out.println("Age        ="+age);
	}
}

public class StudentInfo {
	public static void main(String[] args) {
		Student info=new Student();
		info.input();
		info.display();


	}
}


