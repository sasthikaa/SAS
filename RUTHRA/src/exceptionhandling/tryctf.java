package exceptionhandling;

public class tryctf {
	public static void main(String[] args) {
		
		// error:   try, catch, finally
		// no error: try, finally
		
		try {
			System.out.println(3/1);
			}
			
			catch(Exception e)
			{
				System.out.println("error is " + e);
			}
		
		finally
		{
			System.out.println("welcome");
		}
	}

}
