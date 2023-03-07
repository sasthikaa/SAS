package testngdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {

	ChromeDriver ob;
	@Test(priority=0,description="visiting website ",groups="L")
	public void visitingg()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");//step1
	}
	
	@Test(priority=1,description="maximising website ",groups="L")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2,description="refreshng website ",invocationCount=3,groups="L")
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3,description="clicking ",dependsOnGroups="L")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4,description="quitting website ",dependsOnGroups="L",timeOut=3000)
	public void quit() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}
}
