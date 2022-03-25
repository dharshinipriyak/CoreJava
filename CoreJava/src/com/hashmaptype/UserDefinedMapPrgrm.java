package com.hashmaptype;

import java.util.HashMap;
import java.util.Map;

class Book{
	int refid;
	String bookname,author,publisher;
	int quantity;
	public Book(int refid, String name, String author, String publisher, int quantity) {
		super();
		this.refid = refid;
		this.bookname = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
public class UserDefinedMapPrgrm {

	public static void main(String[] args) {

		//Creating map of Books    
		HashMap<Integer,Book> mapbook=new HashMap<Integer,Book>();    
		//Creating Books    
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
		//Adding Books to map   
		mapbook.put(1,b1);  
		mapbook.put(2,b2);  
		mapbook.put(3,b3);

		//Traversing map  
		for(Map.Entry<Integer, Book> entry:mapbook.entrySet()){    
			int key=entry.getKey();  
			Book b=entry.getValue();  
			System.out.println("Book "+key+" Details:");  
			System.out.println(" Ref.Id       :"+b.refid);   
			System.out.println(" BookName     :"+b.bookname);
			System.out.println(" Author Name  :"+b.author);
			System.out.println(" Published by :"+b.publisher);
			System.out.println(" Quantity     :"+b.quantity);
		}    
	}    


}

