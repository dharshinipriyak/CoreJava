package com.threadannonymous;
//to know the state3 of the thread
class Myclass extends Thread
{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread());
		}
	}
}
public class ThreadLifeCycle {
	public static void main(String[] args) throws InterruptedException {
	
	Myclass ob1=new Myclass();
	Myclass ob2=new Myclass();
	
	System.out.println("State of thread"+ob1.isAlive());
	System.out.println("State of thread"+ob2.isAlive());
	ob1.start();
	System.out.println("State of thread"+ob1.isAlive());
	ob1.join();
	System.out.println("state of thread"+ob1.isAlive());
	ob2.start();
	System.out.println("State of thread"+ob2.isAlive());
	}
}