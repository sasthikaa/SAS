package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {

	public static void main(String[] args) {
		/*
		 * map: container => elements will be stored along with its key
		 * 
		 * key: any datatype
		 * element: any datatype
		 * add
		 * remove
		 * retrive
		 * 
		 * Treemap           :
		 * LinkedHashmap
		 * hashmap
		 * 
		 * 
		 * 
		 * Treemap<dypeofkey, dtypeofelement> name= new TreeMap<>();
		 * 
		 * key:String
		 * element: integer
		 * */
		
		TreeMap<String,Integer>t= new TreeMap<>();
		t.put("zebra", 30);
		t.put("ant", 130);
		t.put("onion", 0);
		t.put("elephant", 350);
		System.out.println(t);
		
		LinkedHashMap<String,Integer>t1= new LinkedHashMap<>();
		t1.put("zebra", 30);
		t1.put("ant", 130);
		t1.put("onion", 0);
		t1.put("elephant", 350);
		System.out.println(t1);
		
		HashMap<String,Integer>t11= new HashMap<>();
		t11.put("zebra", 30);
		t11.put("ant", 130);
		t11.put("onion", 0);
		t11.put("elephant", 350);
		System.out.println(t11);
	}
}
