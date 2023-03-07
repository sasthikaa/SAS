package selenumbrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class repositioning {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.google.com");
		
		//repositioning: moving window from one point to another point
		//point
		// create an object for point class
		// pass desired x and y value in it
		// apply it on the window
		
		Point pt= new Point(200,300);
		c.manage().window().setPosition(pt);
	}
}
