package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	//visit
	c.get("https://courses.letskodeit.com/practice");
	// create an object fpr select class
	//pass dropdown box as input
	// index, value or visible text
	
	WebElement ele = c.findElementById("multiple-select-example");
	Select s= new Select(ele);
	s.selectByIndex(0);
	s.selectByValue("orange");
	s.selectByVisibleText("Peach");
	
	Thread.sleep(3000);
	s.deselectByIndex(1);
}
}
