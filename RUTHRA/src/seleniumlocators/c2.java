package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class c2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.google.com");
		// linktext: word/group of words=> click on it a new url will be opened
		//partial linktext: substring of linktext 
		
		//c.findElementByLinkText("About").click();
		c.findElementByPartialLinkText("Ab").click();
	}
}
