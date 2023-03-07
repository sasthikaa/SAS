package basics;

public class m2 {
	public static void main(String[] args) {
		
		//void - doesnot return anuthing
		
		// int, float, double, string, char 
		
		// other than void
		//  creation: call return statement at the end
		//calling:   call method within sysout statement
		
		System.out.println(m2.add());
		System.out.println(m2.average());
		
		// create a static method that finds area of triangle : public
		// create a static method that returns product of two numbers 
		
	}
	
	public static int add()
	{
		int m=90;
		int n=30;
		int s=m+n;
		return s;
	}
	
	private static double average()
	{
		double a=9.0;
		double b=2.3;
		double c=(a+b)/2;
		return c;
	}

}
