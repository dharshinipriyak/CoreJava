package com.Interfacetypes;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
	TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(32);
		ts.add(4);
		ts.add(22);
		ts.add(81);
		
		System.out.println(ts);
		System.out.println("Ascending Order");
		Iterator<Integer> its=ts.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		Iterator<Integer> itsd=ts.descendingIterator();
		System.out.println("Decending Order");
		while(itsd.hasNext())
		{
			System.out.println(itsd.next());
		}
		TreeSet<String> tss=new TreeSet<String>();
		tss.add("Devi");
		tss.add("Ganga");
		tss.add("Keshava");
		System.out.println(tss);
		System.out.println("Names in Ascending Order");
		Iterator<String> itss=tss.iterator();
		while(itss.hasNext()) {
			System.out.println(itss.next());
		}
		Iterator<String> itssd=tss.descendingIterator();
		System.out.println("Names in Decending Order");
		while(itssd.hasNext())
		{
			System.out.println(itssd.next());
		}
	}

}
