package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class q1 {
	
	/*queu
	 *  not indexed
	 *  add
	 *  remove
	 *  retrieve only head of the queue
	 *  iterate 
	 *  accept duplicates
	 *  size limitation
	 *  
	 *  syntax:  ArrayBlockingQueue<Datatype> name= new ArrayBlockingQueue<>(size);
	 * * 
	 * */
	public static void main(String[] args) {
		//                  Integer 
		ArrayBlockingQueue<Double>t= new ArrayBlockingQueue<>(4);
		t.add(9.8);
		t.add(3.2);
		t.add(1.4);
		t.add(3.5);
		System.out.println(t);
		// remove: 
		t.remove(1.4);
		System.out.println(t);
		System.out.println(t.peek());
		for(double x:t)
		{
			System.out.println(x);
		}
		
	}

}
