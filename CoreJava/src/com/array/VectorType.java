package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class VectorType {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		vec.add("Putin");
		vec.add("Obama");
		vec.add("Tarun");
		vec.add("Mark");
		vec.add("Tom");
		vec.add("Zelensky");
		vec.add(2,"Joe Biden");
		System.out.println(vec);

		System.out.println(vec.get(3));

		vec.remove(1);
		System.out.println(vec);

		Vector<String> vec1=new Vector<String>();
		vec1.add("Donald trump");
		vec1.add("Obama");

		System.out.println(vec.contains("Zelensky"));
		System.out.println(vec.containsAll(vec1));

		vec.addAll(vec);
		System.out.println(vec);

		Collections.sort(vec);
		System.out.println("After sorting"+vec);

		Collections.shuffle(vec);
		System.out.println("After shuffling"+vec);

		vec.clear();
		System.out.println(vec);


	}

}
