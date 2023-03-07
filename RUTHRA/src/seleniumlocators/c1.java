package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		
		/*
		 * 8 locators
		 * 
		 * id
		 * name
		 * classname:  not unique
		 * 
		 * linktext
		 * partial linktext
		 * 
		 * xpath
		 * tagname
		 * css
		  * */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.mycontactform.com");
		// id=user
		
		c.findElementById("user").sendKeys("Dhivyakarthi123");
		
		//name=pass
		c.findElementByName("pass").sendKeys("12345");
		
		//classname=btn_log
		c.findElementByClassName("btn_log").click();
		
	}
}
