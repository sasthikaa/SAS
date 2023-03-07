package overloading;

public class o2 {

	public static void main(String[] args) {
		
		o2 ob=new o2();
		ob.area();
		ob.area(3);
		ob.area(3.2);
		ob.area(3, 9.8);
		ob.area(2.3, 4);
	}
	
	public void area()
	{
		System.out.println("area");
	}
	
	
	public  void area(int side )// number of parameter
	{
		System.out.println("Area of square is "+ side*side);
	}
	
	public  void area(double r)// datatype of parameter
	{
		System.out.println("Area of circle is "+ 3.14*r*r);
	}
	
	public  void area(int l, double b)
	{
		System.out.println("area of rectangle "+ l*b);
	}
	
	public void area(double l, int b)
	{
		System.out.println("Area of triangle is "+ 0.5*l*b);
	}
}
