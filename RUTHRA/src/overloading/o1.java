package overloading;

public class o1 {
	
	/*
	 * inheritance
	 * polymorphism
	 * abstraction
	 * encapsulation
	 * 
	 * polymorphism- many forms- overloading and overriding
	 * 
	 * overloading: using same methodname for different purpose \
	 *              showing difference in number of parameters/datatype /sequence 
	 *              
	 *              static, nonstatic, constructor 
	 ** 
	 * */
	public static void main(String[] args) {
		
		o1.area();
		o1.area(3);
		o1.area(3.2);
		o1.area(3, 3.4);
		o1.area(3.2, 4);
	}
	
	public static void area()
	{
		System.out.println("area");
	}
	
	
	public static void area(int side )// number of parameter
	{
		System.out.println("Area of square is "+ side*side);
	}
	
	public static void area(double r)// datatype of parameter
	{
		System.out.println("Area of circle is "+ 3.14*r*r);
	}
	
	public static void area(int l, double b)
	{
		System.out.println("area of rectangle "+ l*b);
	}
	
	public static void area(double l, int b)
	{
		System.out.println("Area of triangle is "+ 0.5*l*b);
	}

}
