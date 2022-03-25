package com.array;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListType {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mark");
		list.add("Tom");
		list.add("Zelensky");
		list.add("Putin");
		list.add("Obama");
		list.add(2,"Joe Biden");
		System.out.println(list);
		
		//get particular element
		System.out.println(list.get(3));
		
		//remove particular index element
		list.remove(1);
		System.out.println(list);
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Donald trump");
		list1.add("Obama");
		
		//check whether the elements are same
		System.out.println(list.contains("Zelensky"));
		System.out.println(list.containsAll(list1));
		
		//add all elements into same list
		list.addAll(list1);
		System.out.println(list);
		
		//collections
		Collections.sort(list);
		System.out.println("After sorting"+list);
		
		Collections.shuffle(list);
		System.out.println("After shuffling"+list);
		
		//clear all the elements 
		list.clear();
		System.out.println(list);
		
		
		
		
	/*	ArrayList<Integer> listint=new ArrayList<Integer>();
		listint.add(55);
		listint.add(44);
		listint.add(72);
		listint.add(3, 75);
		System.out.println(listint);
		System.out.println(listint.get(3));
		
		ArrayList<Float> listfloat=new ArrayList<Float>();
		listfloat.add(2.7f);
		listfloat.add(499.0f);
		listfloat.add(1,4325.42f);
		System.out.println(listfloat);
		listfloat.clear();
	}*/
	}
}
