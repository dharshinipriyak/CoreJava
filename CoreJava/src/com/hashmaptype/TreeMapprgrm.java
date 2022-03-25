package com.hashmaptype;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapprgrm {
//Treemap key value is Sorted Automatically
	public static void main(String[] args) {
		TreeMap<Long, String> Emp=new TreeMap<Long, String>();
		Emp.put(9786343532l,"lavanya");
		Emp.put(9637778847l,"Lekha");
		Emp.put(8745767778l,"Dhivya");
		Emp.put(8745788874l,"Pooja");
		Emp.put(7767746645l,"Keerthi");
		Emp.put(9786883573l,"Lakshmi");
		Emp.put(9637448844l,"Durga");
		Emp.put(8745763217l,"Dhiya");
		Emp.put(8915788807l,"Praveena");
		Emp.put(7111146604l,"Karunya");
		System.out.println(Emp);
		for(Entry<Long, String> tmob:Emp.entrySet())
		{
			System.out.println(tmob.getKey()+" "+tmob.getValue());
		}

	}

}
