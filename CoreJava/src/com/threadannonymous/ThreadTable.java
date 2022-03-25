package com.threadannonymous;
class Table{
	synchronized void printTable(int n) {
		for(int i=0;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+n*i);
		}
	}
}
public class ThreadTable {

	public static void main(String[] args) {
		Table t=new Table();
		Thread tob =new Thread()
		{
			public void run() {
				System.out.println("Run Method");
				t.printTable(4);
			}
		};
		tob.start();
		new Thread()
		{
			public void run() {
				System.out.println("Run Method");
				t.printTable(6);
			}
		}.start();
	}

}

	
