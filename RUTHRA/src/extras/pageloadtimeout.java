package extras;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class pageloadtimeout {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	//This sets the time to wait for a page to load completely before throwing an error. 
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get("https://demoqa.com/");
	}
}

