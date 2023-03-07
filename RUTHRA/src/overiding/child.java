package overiding;

public class child  extends parent{

	public static void main(String[] args) {
		
		
		// call overriden method
		
		parent p= new parent();
		p.area();
		
		child c= new child();
		c.area();
	}
	
	//overriding method
	public void area()
	{
		int r=3;
		System.out.println("Area f circle is "+ r*r);
	}
}
