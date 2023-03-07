package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleting {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
ChromeDriver c= new ChromeDriver();
//visit
c.get("http://www.google.com");

c.manage().deleteAllCookies();

Set<Cookie> s = c.manage().getCookies();
System.out.println("Number of cookies after deletion "+ s.size());

c.quit();

}
}
