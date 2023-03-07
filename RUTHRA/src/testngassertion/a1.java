package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistener.l1.class)
public class a1 {

	//assrtion: technique , compare actual result with obtained 
	
	/*hard asserts
	 *    provided by Assert builtin class
	 *    static in nature
	 *    once assertion fail, fail the tst case 
	 *    
	 *    
	 *soft asserts
	 *    provided by softassert builtin class
	 *    nonstatic in nature
	 *    even f assertion fails, it will proceed further
	 *    know the actual result=> invoke assertAll()
	 *    
	 *    
	 * assertEquals(actual, obtained)
	 * assertNotEquals(actual, obtained)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * 
	 * */
	
	@Test
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");//step1
		//Assert.assertEquals(ob.getTitle(), "le");
		Assert.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Privacy");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
		
	}
}
