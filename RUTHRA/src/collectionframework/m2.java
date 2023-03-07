package collectionframework;

import java.util.TreeMap;

public class m2 {

	public static void main(String[] args) {
		
		//key: Integer
		// element:character  
		TreeMap<String,Integer>t= new TreeMap<>();
		t.put("zebra", 30);
		t.put("ant", 130);
		t.put("onion", 0);
		t.put("elephant", 350);
		System.out.println(t);
		// remove: know the key
		t.remove("elephant");
		System.out.println(t);
		
		System.out.println(t.get("ant"));
		
		System.out.println(t.keySet());
		
		System.out.println(t.values());
		
		System.out.println(t.entrySet());
		
	}
}
