package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("https://courses.letskodeit.com/practice");
		c.findElementById("bmwradio").click();
		Thread.sleep(3000);
		c.findElementById("benzradio").click();
		Thread.sleep(3000);
		c.findElementById("hondaradio").click();
		Thread.sleep(3000);
	}
}
