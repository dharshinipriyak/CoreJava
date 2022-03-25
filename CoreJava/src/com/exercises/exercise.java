package com.exercises;
//Sum of numbers 1-2+3-4+5
public class exercise {
	public static void main(String[] args) {

		int sum=0;
		for(int i=1;i<=5;i++) {
			if(i%2==0){
				sum=sum-i;
			}
			else
			{
				sum=sum+i;
			}
			}
		System.out.println("Sum of numbers = "+sum);

	}
}
















/*1-2+3-4+5-6+7-8+10 sum
for(int i=1;i<=10;i++){
    if(i%2==0){
     s=s-i;
   }else{
       s=s+i;
  }
}
Sopln("sum of the series="+s);*/

