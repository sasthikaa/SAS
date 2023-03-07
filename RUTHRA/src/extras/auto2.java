package extras;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// selecting auto selection option in auoto complete box in jquery
public class auto2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	

	//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ce=new ChromeDriver();
	
	ce.get("http://jqueryui.com/autocomplete/");
	
	ce.switchTo().frame(0);
	
	WebDriverWait wait= new WebDriverWait(ce,4);
	//step1: identifying the box and sending value in it 
	WebElement textelement = ce.findElementById("tags");
	textelement.sendKeys("a");
	
	// identifying option box 
	WebElement autoOptions = ce.findElement(By.id("ui-id-1"));// options : box 
	// once it is appeared
	wait.until(ExpectedConditions.visibilityOf(autoOptions));
	
    // collecting the value from option box 
	List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
	
	// iterating through it 
	for(WebElement option : optionsToSelect){
		// checking against java 
		
        if(option.getText().equals("Java")) {
        	System.out.println("Trying to select: "+"Java");
            option.click();
            break;
}
}}}
