package testngwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	/*testngwaits/webdriver synchronisation
	 * 
	 * conditional        : explicit wait
	 * unconditional      : implicit wait, thread.sleep()
	 * 
	 * 
	 * implicit wait: once it is declared all the code whih is present after it will take the time limit
	 * 
	 * code is correct: executes within timelimit, it will proceed futher, it will not wait for completion of time limit
	 * code is wrong: it wll wait for completion of time limit, then it will throw up error 
	 * 
	 * 
	 * */
	
	@Test
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");//step1
		ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//5
		System.out.println(ob.getCurrentUrl());//5
		ob.navigate().refresh();//5
		WebElement ele = ob.findElementByLinkText("dhivya");//5
		ele.click();//5
		ob.quit();//5
		
	}
}
