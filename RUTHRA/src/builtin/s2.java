package builtin;

public class s2 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("welcome");
		// index   0   1   2   3    4   5   6  
		//         w   e   l   c    o  m    e
		
		System.out.println(sb.length());
		System.out.println(sb.indexOf("o"));
		System.out.println(sb.charAt(1));
		
		//insert, append
		System.out.println(sb.append("all"));
		System.out.println(sb.insert(0, 'W'));
		
		// delete 
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.delete(7, 10));  // 7,8,9
		
		System.out.println(sb.replace(0, 2, "WE"));
		
		System.out.println(sb.reverse());

		System.out.println(sb.reverse());
		
		System.out.println(sb.substring(3, 7));
	}
}
