package com.threadannonymous;

public class ThreadAnnonymous {
	//Extending the thread
	public static void main(String[] args) {
		// first way 
		/*Thread ob=new Thread() {
			public void run() {
				System.out.println("Run method");
			}
		};
		ob.start();
	}*/
		//second way
		new Thread() {
			public void run() {
				System.out.println("Run method");
			}
		}.start();
		
		//implementing the runnable interface in this case
		Runnable rb=new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable Run method");
			}
		};
		Thread trb=new Thread(rb);
		trb.start();
	}
}