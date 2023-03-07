package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class interve {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	//visit
	c.get("http://www.mycontactform.com");
	
	List<WebElement> l1 = c.findElementsByTagName("a");
	System.out.println("Number of links "+ l1.size());
	// iterating through the list, fetching value present in href attribute
	
	for(WebElement x: l1)
	{
		System.out.println(x.getAttribute("href"));
	}
	
	c.quit();
	
}
}
