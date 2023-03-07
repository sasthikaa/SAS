package builtin;

public class s1 {
	public static void main(String[] args) {
		
		//String=> class and datatype
		// variable, object
		
		String n="Welcome";
		
		// index   0   1    2    3    4   5    6
		//         W   e    l   c     o   m     e
		
		// n=> object, variable
		// nonstatic in nature
		System.out.println(n.length());
		System.out.println(n.indexOf('o'));
		System.out.println(n.charAt(1));
		
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		
		System.out.println(n+"hi");
		System.out.println(n.concat("hi"));
		
		System.out.println(n.replace('l', 'n'));
		System.out.println(n.replace("come", "go"));
		
		System.out.println(n.contains("Wel"));
		
		System.out.println(n);
	}

}
