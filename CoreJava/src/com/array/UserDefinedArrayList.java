package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
	int Id;
	String Name;
	Float Fees;
	static String CollegeName ="Pondicherry University";

	public Student(int id, String name, Float fees) {
		super();
		Id = id;
		Name = name;
		Fees = fees;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Fees=" + Fees + ", College Name"+CollegeName+"]";
	}

}
class Sortid implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.Id>o2.Id)
			return 1;
		else if(o1.Id<o2.Id)
			return -1;
		else
			return 0;
	}
	
}
class SortName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return(o1.Name.compareTo(o2.Name));
		
	}
	
}
class SortFees implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.Fees>o2.Fees)
			return 1;
		else if(o1.Fees<o2.Fees)
			return -1;
		else
			return 0;
	}
	
}
public class UserDefinedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student S1=new Student(201,"Sachin  ",29991.92f);
		Student S2=new Student(301,"Mohan   ",39883.47f);
		Student S3=new Student(202,"Varun   ",44399.74f);

		ArrayList<Student> Slist=new ArrayList<Student>();
		Slist.add(S1);
		Slist.add(S2);
		Slist.add(S3);
		System.out.println(Slist);

		Iterator<Student> sitr=Slist.iterator();
		while(sitr.hasNext())
		{
			Student Ob=sitr.next();
			System.out.println(Ob.Id+" "+Ob.Name+" "+Ob.Fees+"    "+Student.CollegeName);
		}

		//sorting by student id
		Collections.sort(Slist, new Sortid());
		System.out.println("After sorting by Student Id");
		Iterator<Student> sitr1=Slist.iterator();
		while(sitr1.hasNext()) {
			Student Ob1=sitr1.next();
			System.out.println(Ob1.Id+" "+Ob1.Name+" "+Ob1.Fees+"    "+Student.CollegeName);
		}
		//sorting by name
		Collections.sort(Slist, new SortName());
		System.out.println("After sorting by Student Name");
		Iterator<Student> sitr2=Slist.iterator();
		while(sitr2.hasNext()) {
			Student Ob2=sitr2.next();
			System.out.println(Ob2.Id+" "+Ob2.Name+" "+Ob2.Fees+"    "+Student.CollegeName);
		}
		Collections.sort(Slist, new SortFees());
		System.out.println("After sorting by Student Fees");
		Iterator<Student> sitr3=Slist.iterator();
		while(sitr3.hasNext()) {
			Student Ob3=sitr3.next();
			System.out.println(Ob3.Id+" "+Ob3.Name+" "+Ob3.Fees+"    "+Student.CollegeName);
		}
	}

}
