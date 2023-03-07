package seleniumexex;

import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	//visit
	c.get("http://www.google.com");

	System.out.println(c.executeScript("return document.title"));
	System.out.println(c.executeScript("return document.URL"));
	c.quit();
	}
}
