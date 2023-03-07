package Testngattributes;

import org.testng.annotations.Test;

public class t1 {
	/*
	 *testng=> test next generation
	 *inspired from Junit
	 *testing framework
	 *tst cases 
	 *annotations
	 *parallel execution suite execution
	 *automatic report generation 
	 *
	 * test case
	 *     nonstatic
	 *     @Test
	 *     default order: alphabetical order 
 * 
 *      priority : arrange the test case in particular order
 *      description: adding short note on the test case 
 *      groups:  
 *      invocationcount:run the same test case for multiple time
 *      disabling/ignoring : enabled=false  
 *      time out
	 * */
	
	@Test(priority=0,description="its two",groups="O",invocationCount=3,enabled=false)
	public void t2()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=1,description="its three",groups="O")
	public void ab()
	{
		System.out.println("Test case 3");
	}
	
	@Test(priority=2,description="its four",groups="K")
	public void t3()
	{
		System.out.println("Test case 4");
	}

}
