package com.edu.corejva;
//qwertyuiopasdfghjklzxcvbnm,."{}]-();'  ' " 0
import java.util.Scanner;

public class CountA {
	
	
	public static void main(String[] args) {
		// Count the number of words starts with A
		Scanner sc=new Scanner(System.in);
		String s1;
		System.out.println("Enter Any Sentence");
		s1=sc.nextLine();
		//Need space before the sentence so it calc the frst word otherwise it will not consider the first word
		s1=" "+s1;
		int count=0;
		int length=s1.length();
		s1=s1.toUpperCase();
		System.out.println("UpperCase"+s1);
		for(int i=0;i<length-1;i++)
		{
			if (s1.charAt(i)==' '&&s1.charAt(i+1)=='A')
				count++;
		}
		System.out.println("Total Number of Words starts with A = "+count);
		sc.close();
	}

}
