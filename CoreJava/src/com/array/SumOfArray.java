package com.array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);

		//Input the array elements
		System.out.println("Enter the Array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}

		//display the element
		System.out.println("Elements are");
		for(int i=0;i<5;i++) 
		{
			System.out.println(ar[i]);
		}
		System.out.println("Length of the element = "+ar.length);
		//perform arithmetic operations
		System.out.println("Arithmetic Operations");
		int sum=0;
		for(int i=0;i<ar.length;i++) 
		{
			sum=sum+ar[i];
		}
			System.out.println("Sum is="+sum);
			System.out.println("Average is =" +(float)sum/ar.length);

		//Maximum of array
			int max=ar[0];
			for(int i=1;i<ar.length;i++)//assume first index as max 2 1 4 5 8 
			{
				if(max>ar[i])//2<1 then not go to statement
				//2<4 so go to max=4 then again compared to 5 and max=5 and agai comp to
					//8 so max=8
				{
					max=ar[i];
				}
			}
			//Minimum of array
			int min=ar[0];
			for(int i=1;i<ar.length;i++) 
			{
				if(min<ar[i])
				{
					min=ar[i];
				}
			}
			System.out.println("Maximum of array elements = "+max);
			System.out.println("Minimum of array elements = "+min);
	sc.close();}
}
