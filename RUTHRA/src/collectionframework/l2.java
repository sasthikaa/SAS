package collectionframework;

import java.util.ArrayList;

public class l2 {
	public static void main(String[] args) {
		
		ArrayList<String> t= new ArrayList<>();
		t.add("hi");
		t.add("welcome");
		t.add("bye");
		t.add("gp");
		t.add("hi");
		
		//  index  0  1            2   3    4  
		//         hi welcome    bye   gp    hi 
		
		System.out.println(t);
		
		// remove : knw the index
		
		t.remove(1);
		System.out.println(t);
		
		// retrival: know the index
		System.out.println(t.get(1));
		
		// enhanced for loop/ for each loop
		//for(datatype tempvariable: nameofthecollection)
		for(String x:t)
		{
			System.out.println(x);
		}
	}

}
