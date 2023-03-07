package exceptionhandling;

public class trycat {
	public static void main(String[] args) {
		
		/*try,catch, finally, thrw, thrws
		 * 
		 * try: code which is having probability of getting error
		 * catch: handles the exception, willbe executed only when error occurs
		 ** 
		 * */
		try {
		System.out.println(3/0);
		}
		catch(Exception e)
		{
			System.out.println("Error is "+ e);
		}
		
	}

}
