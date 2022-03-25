package com.edu.corejva;
//qwertyuiopasdfghjklzxcvbnm,."{}]-();'  ' " 
public class VolumeEx {
	double volume(double r) //Volume of Sphere
	{
		double v=(4/3)*(22/7)*r*r*r;
		return v;
	}
	double volume(double h,double r) //Volume of Cylinder
	{
		double v=(22/7)*r*r*h;
		return v;
	}
	double volume(double l,double b,double h) //Volume of Cuboid
	{
		double v=l*b*h;
		return v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VolumeEx obj=new VolumeEx();
		System.out.println("Sphere Volume    "+obj.volume(6));
		System.out.println("Cylinder Volume  "+obj.volume(4,5));
		System.out.println("Cuboid Volume    "+obj.volume(7,4,5));
	}

}
