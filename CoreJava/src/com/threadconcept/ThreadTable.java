package com.threadconcept;
class MultiplicationTable
{
	synchronized void printTable(int n)
{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"X"+n+" = "+i*n);
		}
		}
}
class ThreadOne extends Thread
{
	MultiplicationTable t;
	public ThreadOne(MultiplicationTable t) {
		this.t=t;
	}
	public void run() {
		t.printTable(6);
		
	}
}
class ThreadSecond extends Thread
{
	MultiplicationTable t;
	public ThreadSecond(MultiplicationTable t) {
		this.t=t;
	}
	public void run() {
		t.printTable(8);
	}
}
public class ThreadTable {

	public static void main(String[] args) throws InterruptedException {
		MultiplicationTable tab=new MultiplicationTable();
		ThreadOne t1=new ThreadOne(tab);
		ThreadSecond t2=new ThreadSecond(tab);
		t1.start();
		//t1.join();
		t2.start();

	}

}
/*
class Table{
synchronized void printTable(int n) { //if n=2
	for(int i=1;i<=10;i++) {
		System.out.println(n+"X"+i+"="+n*i);  //2X1=2
	}
}
}

class FirstThread extends Thread{
Table t;
FirstThread(Table t){
	this.t=t;
}
public void run() {
	t.printTable(5);
}
}

class SecondThread extends Thread{
Table t;
SecondThread(Table t){
	this.t=t;
	
}
public void run() {
	t.printTable(10);
}
}

public class MainTable {

public static void main(String[] args) throws InterruptedException {
	Table tob=new Table();
	FirstThread t1=new FirstThread(tob);
	SecondThread t2=new SecondThread(tob);
	t1.start();
	//t1.join();
	t2.start();
	
}

}
*/