package multilevel;

public class parent {
	
	protected static void ps()
	{
		System.out.println("parent class static method");
	}
	
	public void pn()
	{
		System.out.println("parent class nonstatic method");
	}

	/*
	 * inheritance: process in which one class acquires properties of other class 
	 * 
	 *    parent/base/super:  class whose properties are inherited
	 *    child/sub/derived:  class which uses properties of parent class
	 *    
	 *    child is using parent class 
	 *    
	 *    to achieve:  child class definition=> extends parentclassname
	 *    
	 *    after inheritance
	 *        child is having full control on the parent
	 *        child object=> methds f parent can be called 
	 *        
	 *        
	 *        single:  parent<=> child
	 *        multiple: parent1,parent<=> child=> java doesnot support it
	 *        hierrarchial: parent<=> child1, child2
	 *        multilevel:  parent<=> child<=> grandchild 
	 *       
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
}
