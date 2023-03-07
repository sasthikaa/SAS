package hierrarchial;

public class child1  extends parent{

	public static void main(String[] args) {
		
		//parnet<=> child1
		//parent<=> child2
		
		child1.c1s();
		child1 ob= new child1();
		ob.c1n();
		
		ob.pn();
		ob.ps();
	}
	
	
	public static void c1s()
	{
		System.out.println("child class static method");
	}
	
	public void c1n()
	{
		System.out.println("child class nonstatic method");
	}

}
