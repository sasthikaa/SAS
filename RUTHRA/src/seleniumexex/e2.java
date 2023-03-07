package seleniumexex;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	//visit
	c.get("http://www.mycontactform.com");
	
	//alert: popup, message box 
	//c.executeScript("alert('time out')");  ok
	
	c.executeScript("window.confirm('time out')");
	
	Thread.sleep(3000);
	Alert a = c.switchTo().alert();
	c.switchTo().alert();
	Thread.sleep(3000);
	c.quit();
}
}
