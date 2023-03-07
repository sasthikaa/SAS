package operators;

public class op1 {
	
	public static void main(String[] args) {
		
		// arithmetic operators:   +,=,*,/
		// comparision operators:  <,>,<=,>=,==,!=
		// assignment operators :  +=,-=,*=,/=
		// conditional operator/ternary operator:   condition ? true : false 
		//logical operators :  and, or ,not
		int age=3;
		System.out.println(age);
		
		// add 10 to age
		//age+=10;
		
		// sub 2 from age 
		//age-=2;
		
		//multiply age by 4
		//age*=4;
		
		//divide age by 3
		//age/=3;
		//System.out.println(age);
		
		//             cond   ?   true : false 
	//System.out.println(age>18 ? "major": "minor");	
		/*
		 *and :  &&
		 *
		 * cond1    cond2   output
		 * true     true     true
		 * true     false    false
		 * false    true     false
		 * false    false    false
		 * 
		 * or:  ||
		 * 
		 *  cond1    cond2   output
		 * true     true     true
		 * true     false    true
		 * false    true     true
		 * false    false    false
		 * 
		 * 
		 * not : !
		 * 
		 * true=> false
		 * false=> true
		 ** 
		 * 
		 * 
		 * 
		 * */
		
		int m=40;
		int n=30;
		System.out.println("and");
		System.out.println(m>20 && n==30);
		System.out.println(m>20 && n==0);
		System.out.println(m==20 && n==30);
		System.out.println(m==0 && n==0);
		
		System.out.println("or");
		System.out.println(m>20 || n==30);
		System.out.println(m>20 || n==0);
		System.out.println(m==20 || n==30);
		System.out.println(m==0 || n==0);
		
		System.out.println("not");
		System.out.println(m==0);
		System.out.println(m!=0);
	}

}
