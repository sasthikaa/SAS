package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {
	public static void main(String[] args) {
		
		/*
		 * 
		 * set 
		 * not indexed
		 * add
		 * remove
		 * retrival is not possible 
		 * will not accept duplicate values
		 * 
		 * tree set           : alphabetical/ascending order
		 * linkedhash set     : insertion order 
		 * hash set           : unpredictable order 
		 * * 
		 * */
		
		TreeSet<String>t= new TreeSet<>();
		t.add("lion");
		t.add("ant");
		t.add("tiger");
		t.add("cat");
		t.add("zebra");
		System.out.println(t);
		
		
	LinkedHashSet<String>t1= new LinkedHashSet<>();
		t1.add("lion");
		t1.add("ant");
		t1.add("tiger");
		t1.add("cat");
		t1.add("zebra");
		System.out.println(t1);
		
		
		HashSet<String>t11= new HashSet<>();
		t11.add("lion");
		t11.add("ant");
		t11.add("tiger");
		t11.add("cat");
		t11.add("zebra");
		System.out.println(t11);
		
		
	}

}
