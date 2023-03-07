package exceptionhandling;

public class trywithmultiple {
public static void main(String[] args) {
	try {
		//System.out.println(3/0);
		String n="hi";
		System.out.println(n.charAt(5));
		
		}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic exception");
	}
	catch(ClassCastException e)
	{
		System.out.println("class cast exception");
	}
		
     catch(ArrayStoreException e)
		{
			System.out.println("ArrayStoreException");
		}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}
