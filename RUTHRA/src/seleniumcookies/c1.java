package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.google.com");
		
		// cookies: temporary information stired by the browser
		
		Set<Cookie> s = c.manage().getCookies();
		System.out.println("Number of cookies "+ s.size());
		
		// iterate through the cookies
		for(Cookie x:s)
		{
			System.out.println("Name is "+ x.getName());
			System.out.println("Path is "+ x.getPath());
			System.out.println("Value is "+ x.getValue());
			System.out.println("Expiry is "+ x.getExpiry());
			System.out.println();
		}
		c.quit();
	}

}

