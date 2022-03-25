package com.exercises;

import java.util.Scanner;


public class ArmstrongNum {
	static void Armstrong() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int n1=n;
		int d,sum=0;
		while(n!=0)
		{
			d=n%10;
			sum=(int)(sum+Math.pow(d,3));
			n=n/10;
			
		}
		if(n1==sum){
			System.out.println("Given number is armstrong number");

		}
		else
		{
			System.out.println("Given number is not armstrong number ");
		}
		sc.close();
	}


	public static void main(String[] args) {
		ArmstrongNum.Armstrong();

	}

}
