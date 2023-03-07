package interfacee;

public interface Intro {
	
	//Interface: blue print of class
	// doesnot contain static method
	// will have default nonstatic method
	// will have abstract method
	// class<=> interface:   class definition=> implements interfacename 

	default public void ns()
	{
		System.out.println("Nonstatic method");
	}
	
	public void ab();
}
