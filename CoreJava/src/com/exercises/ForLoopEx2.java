package com.exercises;

public class ForLoopEx2 {
	//1/2+1/3+1/4+1/5+1/6+1/7+/1/8+1/9+1/10
public static void main(String[] args) {
	float f1=0;
	for(int i=2;i<=10;i++)
	{
		f1=f1+(float)1/i;
	}
	System.out.println(f1);
}

}









/*1/2+1/3+1/4+1/5+1/6+1/7+/1/8+1/9+1/10
float s=0;
 for(int i=2;i<=10;i++){
     s=s+(float)1/i;
}
Syso("sum="+s);*/


