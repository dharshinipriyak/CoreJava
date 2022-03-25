package com.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteratetype {

	public static void main(String[] args) {
		ArrayList<Integer> iList=new ArrayList<Integer>();
		for(int i=0;i<=10;i++)
		{
			iList.add(i);
		}
		System.out.println(iList);
		
		//individual element to display
		Iterator<Integer> itr1=iList.iterator();
		//using while loop
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		//using for loop
		for(Integer i:iList) {
			System.out.println(i);
		}
		
		//using ListIterator
		ListIterator<Integer> Litr=iList.listIterator();
		
		//forward direction
		System.out.println("ListIterator Forward direction");
		
		while(Litr.hasNext()) {
			
			System.out.println(Litr.next());
		}
		
		System.out.println("ListIterator Backward direction");
		while(Litr.hasPrevious()) {
			
			System.out.println(Litr.previous());
		}
	}

}
