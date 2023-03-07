package encapsulation;

public class e1 {

	/*
	 * encapsulation: data hiding
	 * 
	 * declare the variable as private
	 * must not assign value to the variable straightly
	 * 
	 * access the variable through setters and getters
	 * 
	 * setters, getters-> nonstatic, public
	 * 
	 * setter: assign value to the variable
	 * getter: view the value stored in variable 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	private String password;
	
	//setter
	
	public void setp(String p)
	{
		password=p;
	}
	
	//getter
	public void getp()
	{
		System.out.println(password);
	}
}
