package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("https://courses.letskodeit.com/practice");
		// create an object fpr select class
		//pass dropdown box as input
		// index, value or visible text
		
		WebElement ele = c.findElementById("carselect");
		Select s= new Select(ele);
		//s.selectByIndex(2);
		//s.selectByValue("benz");
		s.selectByVisibleText("Benz");
	}

}
