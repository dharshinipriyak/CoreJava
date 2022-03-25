package com.hashmaptype;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPrgrm {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lm=new LinkedHashMap<Integer, String>();
		lm.put(2,"lenovo");
		lm.put(6,"Livetech");
		lm.put(3,"Dell");
		lm.put(8,"Samsung");
		lm.put(7,"Dell");
		System.out.println(lm);
		for(Map.Entry<Integer, String> lmob:lm.entrySet())
				{
					System.out.println(lmob.getKey()+" "+lmob.getValue());
				}
	}

}
