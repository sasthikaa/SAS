package testngdependency;

import org.testng.annotations.Test;

public class d1 {
//dependsOnMEthods
	
	@Test(priority=0)
	public void login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=1,dependsOnMethods="login")
	public void home()
	{
		System.out.println("Home");
	}
	
	//login: pass     home: pass
	//login: fail     home: skipped 
}
