package basics;

public class varibl {
	public static void main(String[] args) {
		
		//variable=> name given to a memory location
		// syntax for variable declaration: datatype variablename=value
		
		/*word     :   String
		 letter    :   char
		 numbers   :   int, double, float
		   
		               double:   can store upto 16 digits after decimal point
		               float :   can store upto 8 digits after decimal point, add f at the end
		               
		  true/false: boolean
		 ** 
		 * */
		
		//datatype variablename=value 
		String n="dhivya";
		char le='k';
		int age=30;
		double h=62.5;
		float w=7.8f;
		boolean r=true;
		
		System.out.println("Name is "+ n);
		System.out.println("Letter is "+ le);
		System.out.println("Age is "+ age);
		System.out.println("Height is "+ h);
		System.out.println("Weight is "+ w);
		System.out.println("Result is "+ r);
		
		// area of square :  side*side
		// area of triangle: 0.5*b*h
		// average of two numbers : (a+b)/2
		// perimetre of a square: 4*side
		
		int b=9;
		int h1=30;
		System.out.println("area of triangle is "+ 0.5*b*h1);
		
	}

}
