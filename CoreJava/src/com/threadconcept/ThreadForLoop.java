package com.threadconcept;
//join method
//sleep method
class MyThread1 extends Thread
{
	public MyThread1(String string) {
		super(string);//super class constructor
	}

	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("i ="+i+"thread"+Thread.currentThread());
			try {
				Thread.sleep(1000);//takes time to execute (ie., 1 sec)
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class ThreadForLoop {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 ob=new MyThread1("First");
		MyThread1 ob1=new MyThread1("Second");
		ob.start();
		ob1.start();
		

	}

}
