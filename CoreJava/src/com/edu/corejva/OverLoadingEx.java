package com.edu.corejva;

class Overloading
{
	void display(int i,int j)
	{
		int s;
		s=i+j;
		System.out.println("Integer vale of the sum of "+i+" and "+j+" is "+s);
	}
	void display(float i,float j)
	{
		float s;
		s=i+j;
		System.out.println("Float value of the sum of "+i+" and "+j+" is "+s);
	}
	void display(double i,double j)
	{
		double s;
		s=i+j;
		System.out.println("Double value of the sum of "+i+" and "+j+" is "+s);
	}
}
public class OverLoadingEx {
	public static void main(String[] args) {
		Overloading ov=new Overloading();
		ov.display(2, 4);
		ov.display(6.3f, 4.2f);
		ov.display(23.7,4.3);
	}

}
