package extras;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autosuggestions {
public static void main(String[] args) throws InterruptedException {
	
	//clicking on option in auto suggestion in yahoo search text box 
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ce=new ChromeDriver();
	ce.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ce.get("http://www.google.com");
	ce.navigate().refresh();
	WebElement ele = ce.findElementByName("q");
	ele.sendKeys("selenium");
	WebDriverWait wait= new WebDriverWait(ce,4);
	WebElement autoOptions = ce.findElement(By.className("aajZCb"));
	wait.until(ExpectedConditions.visibilityOf(autoOptions));
	List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("span"));
	for(WebElement option : optionsToSelect){
        if(option.getText().equals("selenium tutorial")) {
        	System.out.println("Trying to select: "+"Java");
            option.click();
            break;
        }}
}
  
    
}
	
	
	
 


