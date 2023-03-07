package selenumbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class zoom {
	public static void main(String[] args) throws InterruptedException {
		
		//greater than 100=> zoomin
		// less than 100=> zoom out
		// nrml=> 100
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		//visit
		c.get("http://www.google.com");
		c.executeScript("document.body.style.zoom='200%'"); // zoom in
		
		Thread.sleep(3000);
		c.executeScript("document.body.style.zoom='20%'"); // zoom out
		
		Thread.sleep(3000);
		
		c.executeScript("document.body.style.zoom='100%'"); // nrml
		
		Thread.sleep(3000);
	}

}
