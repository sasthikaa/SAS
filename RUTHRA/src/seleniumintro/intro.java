package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class intro {
	
	public static void main(String[] args) throws InterruptedException {
		
		//step1(once a project):  right click=> properties=> java buildpath=> libraries=>
		//classpath=> add external jar=> browser//apply and close 
	    
		// step2:  configuring chromedriver
		//step3: creating object for chromedriver class
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.google.com");
		
		// max
		//c.manage().window().maximize();
		
		//c.manage().window().fullscreen();
		
		//refresh
		c.navigate().refresh();
		
		// hold the page for certain seconds
		Thread.sleep(3000);
		
		//close
		c.quit();
		
	}

}
