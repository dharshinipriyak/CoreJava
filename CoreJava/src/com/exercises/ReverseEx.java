package com.exercises;

import java.util.Scanner;
public class ReverseEx {

	// TODO Auto-generated method stub
	static void ReverseCheckpallindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int d=0,rev=0;
		int n1=n;		//comparision
		while(n!=0)  	 //n=123     		 n=12       	n=1
		{
			d=n%10;  	  //d=3       	 	d=2			d=1
			rev=rev*10+d; //rev=0*10+3=3		3*10+2=32		32+10+1=321
			n=n/10;		//123/10=12			12/10=1			1/10=0

		}
		System.out.println("Reverse number ="+rev);
		if(n1==rev)
		{
			System.out.println("Given number is a pallindrome number");
		}
		else
		{
			System.out.println("Given number is Not a pallindrome number");
		}
	}


	public static void main(String[] args) {
		ReverseCheckpallindrome();

	}

}
