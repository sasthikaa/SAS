package collectionframework;

import java.util.Hashtable;

public class ht {
	
	public static void main(String[] args) {
		
		Hashtable<String,Integer>t= new Hashtable<>();
		t.put("onion", 30);
		t.put("rat", 3);
		t.put("apple", 0);
		t.put("table", 230);
		System.out.println(t);
		
		// remove: know the key
		t.remove("apple");
		System.out.println(t);
		
		System.out.println(t.get("onion"));
		
		System.out.println(t.keySet());
		System.out.println(t.values());
		System.out.println(t.entrySet());
		
	}

}
