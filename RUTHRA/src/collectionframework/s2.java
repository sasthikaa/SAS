package collectionframework;

import java.util.TreeSet;

public class s2 {
	public static void main(String[] args) {
		//LinkedHashSet=> Integer
		TreeSet<String>t= new TreeSet<>();
		t.add("lion");
		t.add("ant");
		t.add("tiger");
		t.add("cat");
		t.add("zebra");
		System.out.println(t);
		
		t.remove("ant");
		System.out.println(t);
		for(String x:t)
		{
			System.out.println(x);
		}
	}

}
