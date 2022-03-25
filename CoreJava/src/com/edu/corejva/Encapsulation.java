package com.edu.corejva;
import java.util.Scanner;

//Encapsulation: Binding of data

//class method variable

class Employee{  //blue print or it user defined data type
	int eid;  //instance variables
	String name;
	float sal;
	
	//member function or methods
	void input() {
		//access data
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter a name");
		name=sc.next();
		System.out.println("Enter a eid");
		eid=sc.nextInt();
	}
	void display() {
		//all the data
		System.out.println("Name="+name);
		System.out.println("eid="+eid);
		
	}
	
}//scope of employee data

public class Encapsulation {

	public static void main(String[] args) {
		int i; //predefined  4 bytes
	Employee ob=new Employee(); //size of ob 10 bytes
	ob.input();
	ob.display();

	}

}
