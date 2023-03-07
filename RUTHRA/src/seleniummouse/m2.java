package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	//visit
	c.get("https://jqueryui.com/droppable/");
	
	//webelements: present inside a frame
	// switch your control to that frame
	// frame : index, name, id
	c.switchTo().frame(0);
	Actions ac= new Actions(c);
	WebElement ele1 = c.findElementById("draggable");
	WebElement ele2 = c.findElementById("droppable");
	ac.dragAndDrop(ele1, ele2).build().perform();
}
}
