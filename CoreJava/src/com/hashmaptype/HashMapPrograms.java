package com.hashmaptype;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrograms {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(199,"tarik");
		hm.put(27, "Vishali");
		hm.put(177, "Girija");
		System.out.println(hm);
		for(Map.Entry<Integer, String> ob:hm.entrySet())
		{
			System.out.println(ob.getKey()+" "+ob.getValue());
		}

	}

}
