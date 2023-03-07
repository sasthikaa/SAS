package testngwait;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class c2 {
	
	
	
	/* explicit wait- conditional
	 * create an object for webdrivrwait class
	 * pass driver instance and time limt as input
	 * call untill method
	 * call expectedconditions
	 * 
	 * 
	 * 
	 * code is correct: executes within timelimit, it will proceed futher, it will not wait for completion of time limit
	 * code is wrong: it wll wait for completion of time limit, then it will throw up error 
	 * 
	 * 
	 * */
	@Test
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		WebDriverWait w= new WebDriverWait(ob,5);
		
		//title
		//w.until(ExpectedConditions.titleIs(".,n,n"));//5
		//w.until(ExpectedConditions.titleContains("oo"));
		
		//alert is present
		//w.until(ExpectedConditions.alertIsPresent());
		
		// check visibility of an element
		//find the element and check its visibility
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy")));
		
		// images
		// visible or not
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		// clickable or not
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		ob.quit();
		
		
		
		
	}
	
}
