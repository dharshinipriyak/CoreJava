package com.exercises;

import java.util.Scanner;
public class DigitCount {
static void Digit()
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
	int d=0;
	int s=0;
	int c=0;
	while(n!=0) {
		d=n%10;
		s=s+d;
		n=n/10;
		c++;
	}
	System.out.println("Sum of the number "+s);
	System.out.println("Number of digit   "+c);
}
	public static void main(String[] args) {
		Digit();
	}

}
