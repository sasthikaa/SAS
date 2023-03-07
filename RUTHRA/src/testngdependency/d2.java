package testngdependency;

import org.testng.annotations.Test;

public class d2 {
	
	//dependsonGroups: create connection between test cases and group
	
	@Test(priority=0,groups="O1")
	public void enu()
	{
		System.out.println("Entering username ");
	}
	
	
	@Test(priority=1,groups="O1")
	public void enp()
	{
		System.out.println("Entering password");
	}
	
    @Test(priority=2,groups="O1")
	public void login1()
	{
    	System.out.println("login");
	}
	
	@Test(priority=3,dependsOnGroups="O1")
	public void home1()
	{
		System.out.println("home");
	}
	
	//groups: 3-0    :  all pass: home: pass
	// even 1 fail      home skipped 

}
