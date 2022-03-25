package com.threadannonymous;

class A extends Thread
{
	public void run() {
		
	}
}
public class IsAliveType {

	public static void main(String[] args) {
		Thread ob=new Thread();
		ob.start();
		System.out.println(ob.isAlive());
	}
}
