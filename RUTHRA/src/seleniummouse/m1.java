package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m1 {

	public static void main(String[] args) throws InterruptedException {
		
		/*click
		 * double click
		 * context click
		 * mouse hovering
		 * click, hold and release
		 * drag and drop 
		 * drag and drop by
		 * 
		 * create an object for actions class
		 * pass driver instance as input
		 * 
		 * 
		 * 
		 * 
		 * */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.mycontactform.com");
		WebElement ele = c.findElementByName("btnSubmit");
		Actions ac= new Actions(c);
		//ac.click(ele).build().perform();
		//ac.doubleClick(ele).build().perform();
		//ac.contextClick(ele).build().perform();
		//ac.moveToElement(ele).click().build().perform();
		ac.clickAndHold(ele).build().perform();
		Thread.sleep(3000);
		ac.release(ele).build().perform();
		
	}
}
