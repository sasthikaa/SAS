package hierrarchial;

public class child2 extends parent {

public static void main(String[] args) {
		
		//parnet<=> child1
		//parent<=> child2
		
		child2.c2s();
		child2 ob= new child2();
		ob.c2n();
		
		ob.pn();
		ob.ps();
	}
	
	
	public static void c2s()
	{
		System.out.println("child class static method");
	}
	
	public void c2n()
	{
		System.out.println("child class nonstatic method");
	}
}
