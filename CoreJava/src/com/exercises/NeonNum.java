package com.exercises;

import java.util.Scanner;

//qwertyuiopP asdfghjkl zxcvbnm , . " { } [] - ( ) ; '  ' "0  \
public class NeonNum {
	static void Neon() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	int square=n*n;
	int d,sum=0;
	while(square!=0)
	{
		d=square%10;
		sum=sum+d;
		square=square/10;
		
	}
	if(sum==n){
		System.out.println("Given number is Neon number");

	}
	else
	{
		System.out.println("Given number is not a Neon number ");
	}
	sc.close();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Neon();

	}

}
