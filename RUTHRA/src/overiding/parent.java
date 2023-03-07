package overiding;

public class parent {
	
	/*overriding : using same methodname for different purpose
	 *             showing difference in location
	 *             
	 *             follows inheritance
	 *             nonstatic 
	 *             
	 *             method: parent: overriden method   :  parent object 
	 *             method: child: overriding          : child object * 
	 * 
	 * */
	
	//overriden method
	public void area()
	{
		int side=4;
		System.out.println("Area of square is "+ side*side);
	}

}



