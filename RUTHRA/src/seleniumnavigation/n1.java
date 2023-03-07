package seleniumnavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");//step1
	Thread.sleep(3000);
	ob.findElementByLinkText("Images").click();//step2
	Thread.sleep(3000);
	// back to step1
	ob.navigate().back();
	Thread.sleep(3000);
	ob.navigate().forward();
	Thread.sleep(3000);
	ob.quit();
	
	
}
}
