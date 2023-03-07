package basics;

public class m6 {
public static void main(String[] args) {
	
	
	//parameter: variable passed to a function 
	// argument: value assigned to the parameter
	
	m6.area(90, 50);// l=90 b=50
	m6 ob= new m6();
	ob.product(7.8, 9.0);// m=7.8  n=9.0
	
	// static : div of two 
	// nonstatic: average 
	
	
}

public static void area(int l, int b) // l , b=> parameters
{
	System.out.println("Area of rectangle is "+ l*b);
	}


public void product(double m, double n)
{
	System.out.println("Product of two numbers "+ m*n);}
}
