package Multithreading;

public class Threadcreating   extends Thread{
	public static void main(String[] args) {
		/*Multithreading in Java is a process of executing multiple threads simultaneously.
          A thread is a lightweight sub-process, the smallest unit of processing
          
           advantages
               * you can perform multiple operations at the same time.
               *  You can perform many operations together, so it saves time.
               * Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
           
           There are two ways to create a thread:

                    *   By extending Thread class
                    *   By implementing Runnable interface.
                    *   *
*///create an object for the class 
		Threadcreating ob= new Threadcreating();
		ob.start();
		}
	
	public void run()
	{
		System.out.println("Thread has started running");
	}

}
