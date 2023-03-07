package seleniumget;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.google.com");
		
		//title
		System.out.println(c.getTitle());
		
		//url
		System.out.println(c.getCurrentUrl());
		
		// getting size of the window
		// size=> height and width of the window
		//Dimension 
		Dimension s = c.manage().window().getSize();
		System.out.println("Height is "+ s.getHeight());
		System.out.println("width is "+ s.getWidth());
		
		//position
		// x and y value of the window
		//Point
		
		Point pt = c.manage().window().getPosition();
		System.out.println("x value is "+ pt.getX());
		System.out.println("y value is "+ pt.getY());
		
		Capabilities g = c.getCapabilities();
		System.out.println("Broswer name is "+ g.getBrowserName());
		System.out.println("Browser version is "+ g.getVersion());
		System.out.println("Os name is "+ g.getPlatform());
		
		c.quit();
	}
}
