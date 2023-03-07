package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tg {
	public static void main(String[] args) {
		//images: img
		// links: a
		// elements: div, input, select
		// cannot identify a sngle element using tagname
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.mycontactform.com");
		
		List<WebElement> l = c.findElementsByTagName("img");
		System.out.println("Number of images "+ l.size());
		
		List<WebElement> l1 = c.findElementsByTagName("a");
		System.out.println("Number of links "+ l1.size());
		
		List<WebElement> l2 = c.findElementsByTagName("div");
		System.out.println("Number of elements with div tag  "+ l2.size());
		
		
		//facebook=> number of images, links,  input 
		c.quit();
	}

}
