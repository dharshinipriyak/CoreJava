package com.threadconcept;
class Mythread extends Thread{
	public void run()
	{
		System.out.println("Inside run "+Thread.currentThread());
	}
}
public class MainThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Mythread T=new Mythread();
		Mythread T1=new Mythread();
		
		T1.setName("Second");
		T.setName("First");
		T.start();
		T1.start();

	}

}
/*
//To create thread based application
//1. Extend your class with Thread class and override public void run()
//to call run method jvm(Java Virtual Machine) uses ob.start()
//start can be used only once on particular object
class MyThread extends Thread{
	public void run() {
		System.out.println("Inside run "+Thread.currentThread());
	}
}

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread()); //main thread
		MyThread ob=new MyThread();
		MyThread ob1=new MyThread();
		ob.setName("first"); //change the predefined name
		ob1.setName("second");
		ob.start();//Excecution of Thread is controlled by JVM
		            //You cannot predict the output
		ob1.start();
		//thread can be started only once on particular object
		//if you start more than once, It will throw IlligalThreadState Exception
	}
}*/