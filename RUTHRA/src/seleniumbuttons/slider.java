package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	//visit
	c.get("https://jqueryui.com/slider/");
	/*
	 * horizontal slider : move along x axis, y value will be 0
	 * vertical slider    : move along u axis, x value will be 0
	 * * 
	 * */
	c.switchTo().frame(0);
	Actions ac= new Actions(c);
	WebElement ele = c.findElementById("slider");
	ac.dragAndDropBy(ele, 40, 0).build().perform();
}
}
