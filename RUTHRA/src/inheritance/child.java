package inheritance;

public class child extends parent{
	
	public static void main(String[] args) {
		
		//callint its own method
		child.cs();
		child c= new child();
		c.cn();
		
		//after inheritance
		c.pn();
		c.ps();
	}

	public static void cs()
	{
		System.out.println("child class static method");
	}
	
	public void cn()
	{
		System.out.println("child class nonstatic method");
	}

}
