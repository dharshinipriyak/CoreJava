package com.threadconcept;
class MyThreads implements Runnable
{
	@Override
	public void run() {
		System.out.println("Inside Run"+Thread.currentThread());
	}
}
public class ThreadRunnable {
	public static void main(String[] args) {

		MyThreads ob=new MyThreads();
		MyThreads ob1=new MyThreads();
		MyThreads ob2=new MyThreads();
		Thread tob=new Thread(ob);
		tob.setName("First Thread");
		tob.start();
			Thread tob1=new Thread(ob1);
			tob1.setName("Second Thread");
			tob1.start();
				
				Thread tob2=new Thread(ob2);
				tob2.setName("Third Thread");
				tob2.start();
	}
}





/*/Creating Thread by implementing Runnable interface
class MyThread1 implements Runnable{

@Override
public void run() {
	System.out.println("Inside run method");
}
}

public class MainRunnable {

public static void main(String[] args) {
	MyThread1 ob=new MyThread1();
	//start method is defined in Thread
	Thread tob=new Thread(ob);
	tob.start();
	}

}*/