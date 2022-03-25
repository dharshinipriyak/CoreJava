package com.Interfacetypes;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Students
{
	int id;
	String name;

	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

class SortById implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		if(o1.id>o2.id)
			return 1;
		else if(o1.id<o2.id)
			return -1;
		else
			return 0;
	}

}
class SortByName implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return(o1.name.compareTo(o2.name));
	}


}
public class UserDefinedSetInterface {

	public static void main(String[] args) {

		Students s1=new Students(218,"Surendar");
		Students s2=new Students(198,"Manohar");
		Students s3=new Students(313,"Shankar");
		Students s4=new Students(293,"Pradeep");
		SortById sid=new SortById();
		TreeSet<Students> ob=new TreeSet<Students>(sid);
		ob.add(s1);
		ob.add(s2);
		ob.add(s3);
		ob.add(s4);
		Iterator<Students> iob=ob.iterator();
		while(iob.hasNext())
		{
			Students Sob=iob.next();
			System.out.println(Sob.id+"  "+Sob.name);
		}

		SortByName sbn=new SortByName();
		TreeSet<Students> ob1=new TreeSet<Students>(sbn);
		ob1.add(new Students(201, "Ravi"));
		ob1.add(s1);
		ob1.add(s2);
		ob1.add(s3);
		ob1.add(s4);
		System.out.println("Treeset based on Name");
		Iterator<Students> iob1=ob1.iterator();
		while(iob1.hasNext())
		{
			Students Sob1=iob1.next();
			System.out.println(Sob1.id+"  "+Sob1.name);
		}

	}
}


