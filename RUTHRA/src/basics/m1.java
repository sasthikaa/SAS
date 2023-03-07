package basics;

public class m1 {
public static void main(String[] args) {
	
	m1.area();
	m1.add();
	
	System.out.println(m2.add());// public
	//System.out.println(m2.average());
}

//public: addition of three number
//private:product of two numbers 
public static void area()
{
	int l=90;
	int b=40;
	System.out.println("area of rectangle is "+ l*b);
	}

private static void add()
{
	double a=0.9;
	double b=3.4;
	System.out.println("Addition "+ (a+b));
	}
}

/*method: block of code which performs certain action
 * 
 *    should be created outside the main method
 *    should be called inside the main method
 *    
 *    
 *    static:  fixed memory space, no need to allocate separate memory space
 *    
 *    syntax for creation:  accessmdifier static returntype name(){}
 *    syntax for calling: classname.methodname();
 *    
 *    public, private , protected
 *    returntype=> int, float, double...void
 * 
 * 
 * */
