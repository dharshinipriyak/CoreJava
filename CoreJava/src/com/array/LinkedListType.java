package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListType {

	public static void main(String[] args) {
		LinkedList<String> lik=new LinkedList<String>();
		lik.add("Tarun");
		lik.add("Mark");
		lik.add("Tom");
		lik.add("Zelensky");
		lik.add("Putin");
		lik.add("Obama");
		lik.add(2,"Joe Biden");
		System.out.println(lik);

		System.out.println(lik.get(3));

		lik.remove(1);
		System.out.println(lik);

		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Donald trump");
		list1.add("Obama");

		System.out.println(lik.contains("Zelensky"));
		System.out.println(lik.containsAll(list1));

		lik.addAll(list1);
		System.out.println(lik);

		Collections.sort(lik);
		System.out.println("After sorting"+lik);

		Collections.shuffle(lik);
		System.out.println("After shuffling"+lik);

		lik.clear();
		System.out.println(lik);



	}

}
