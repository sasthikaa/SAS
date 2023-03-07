package collectionframework;

import java.util.ArrayList;

public class l1 {

	// list, map, set, queue, table
	
	public static void main(String[] args) {
		
		/*
		 * list
		 *  index based
		 *  add
		 *  remove
		 *  retrieve
		 *  iterate
		 *  
		 *  syntax:  ArrayList<Datatype> name= new ArrayList<>();
		 *  
		 *  String=> String
		 *  int=> Integer
		 *  char=> Character
		 *  double=> Double
		 * */
		
		ArrayList<Integer> t= new ArrayList<>();
		t.add(9);
		t.add(91);
		t.add(19);
		t.add(49);
		t.add(9);
		
		//  index  0  1   2   3    4  
		//         9  91  19  49   9
		
		System.out.println(t);
		
		// remove : knw the index
		
		t.remove(1);
		System.out.println(t);
		
		// retrival: know the index
		System.out.println(t.get(1));
		
		// enhanced for loop/ for each loop
		//for(datatype tempvariable: nameofthecollection)
		
		for(int x:t)
		{
			System.out.println(x);
		}
	}
}
