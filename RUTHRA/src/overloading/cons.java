package overloading;

public class cons {
public static void main(String[] args) {
	
	
	cons ob= new cons();
	cons ob1= new cons(3);
	cons ob2= new cons(3.4);
	cons ob3= new cons(3,4.5);
	cons ob4= new cons(4.5,9);
}

public cons()
{
	System.out.println("cons");}

public cons(int s)
{
	System.out.println("area of square is "+ s*s);}

public cons(double r)
{
	System.out.println("area of circle is "+ 3.14*r*r);}

public cons(int l, double v)
{
	System.out.println("area of rectangle is "+ l*v);
	}


public cons(double a, int b)
{
	System.out.println("area of triangle is "+ 0.5*a*b);}

}
