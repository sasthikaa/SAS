package Multithreading;

public class multi2 implements Runnable{
public static void main(String[] args) {
	
	multi2 ob1= new multi2();
	multi2 ob2= new multi2();
	
	//performing single task by multiple threads
	Thread t1 =new Thread(ob1);
	Thread t2 =new Thread(ob2);  
	  
	t1.start();  
	t2.start();
}

public void run()
{
	System.out.println("TASK 1");}
}
