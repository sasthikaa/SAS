package selenumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class resizing {

	public static void main(String[] args) {
		
		//resizing: changing height and width of the window
		
		// create an object for dimension class
		// pass desired height and width value in it
		//apply it on the window
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.google.com");
		
		Dimension d= new Dimension(400,400);
		c.manage().window().setSize(d);
		
	}
}
