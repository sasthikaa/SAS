package basics;

public class m5 {

	public static void main(String[] args) {
		
		//void : int, float, double, string, boolean
		
		// creation: add return statement at the end
		// calling: within sysout statement
		
		m5 ob= new m5();
		System.out.println(ob.prod());
		System.out.println(ob.add());
	}
	
	
	public int prod()
	{
		int a=90;
		int b=4;
		int c=a*b;
		return c;
	}
	
	
	private double add()
	{
		double m=4.5;
		double n=3.4;
		return m+n;
	}
}


