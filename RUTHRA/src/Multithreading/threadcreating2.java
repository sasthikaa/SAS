package Multithreading;

public class threadcreating2 implements Runnable{
	public static void main(String[] args) {
		
		//creating an object for class
		threadcreating2 ob= new threadcreating2();
		// using constructor of runnable
		//passing class object as input 
		Thread t1= new Thread(ob);
		t1.start();
	}

	public void run() {
		
		System.out.println("Thread has started ");
		
	}

}
