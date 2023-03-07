package basics;

public class m4 {

	
	public static void main(String[] args) {
		
		//classname objectname= new classname();
		// objectname.methodname();
		
		m4 ob= new m4();
		ob.product();
		ob.add();
		
	}
	
	public void product()
	{
		float a=3.4f;
		float b=2.4f;
		System.out.println("Product is "+ a*b);
	}
	
	
	private void add()
	{
		int a=9;
		int b=3;
		System.out.println("addition "+ (a+b));
	}
	
	
}

/*should be created outside the main method
 * should be called inside the main method
 * 
 * nonstatic : doesnot contain fixed memory space, we need to allocate sprte memory space for calling it
 * 
 * 
 * syntax for creation:   accessmodifier returntype name(){}
 * syntax for calling:
 *    step1: creating and naming object:   classname objectname= new classname();
 *    step2:  calling                  :   objectname.methodname();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
