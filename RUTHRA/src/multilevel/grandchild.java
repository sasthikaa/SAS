package multilevel;

public class grandchild extends child {

	public static void main(String[] args) {
		
		//parent=>child<=> grandchild
		// grandchild can call child methods
		// can call parent methods 
		
		grandchild.gs();
		grandchild g= new grandchild();
		g.gn();
		
		// child
		
		g.cn();
		g.cs();
		
		// 
		g.pn();
		g.ps();
	}
	
	public static void gs()
	{
		System.out.println("grandchild static method");
	}
	
	public void gn()
	{
		System.out.println("grandchild nonstatic metho");
	}
}
