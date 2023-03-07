package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class dpck {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("https://jqueryui.com/datepicker/");
		c.switchTo().frame(0);
		c.findElementById("datepicker").click();
		
		for(int i=0;i<2;i++)
		{
		c.findElementByCssSelector("#ui-datepicker-div > div > a.ui-datepicker-next.ui-corner-all > span").click();
	    
		
		}
		
		c.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(7) > a").click();
	}
		

}
