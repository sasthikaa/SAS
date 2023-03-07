package Multithreading;

public class multi1  extends Thread{

	public static void main(String[] args) {
		
		//performing single task by multiple thread
		multi1 t1=new multi1();  
		  multi1 t2=new multi1();  
		  multi1 t3=new multi1();  
		  
		  t1.start();  
		  t2.start();  
		  t3.start();  
	}
	public void run()
	{
		System.out.println("FIRST TASK");
	}
}
