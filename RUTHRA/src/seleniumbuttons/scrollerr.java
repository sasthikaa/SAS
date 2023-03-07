package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class scrollerr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.seleniumeasy.com");
		
		/*horizontal scroller :  move along x axis, y value wll be o
		 *                       right : x value
		 *                       left:  -x value
		 * vertical scroller:  move along y axis , x value will be 0
		 *                     down: +y
		 *                     up  : -y
		 * 
		 * 
		 * */
		
		//pageup and pagedown
		/*c.executeScript("window.scrollBy(0, document.body.scrollHeight)");//down
		Thread.sleep(3000);
		c.executeScript("window.scrollBy(0, -document.body.scrollHeight)");//up
		Thread.sleep(3000);*/
		
		c.executeScript("window.scrollBy(0, 500)");//down
		Thread.sleep(3000);
		c.executeScript("window.scrollBy(0, -500)");//up
		Thread.sleep(3000);
		
		
	}
}
