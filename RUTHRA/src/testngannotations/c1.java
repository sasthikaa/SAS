package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	/*
	 * before test: only once, before all the test case started its execution
	 * after test: only once, after all the test case finished its execution
	 * 
	 * before class: only once, after before tst 
	 * after class: only once, before after test 
	 * 
	 * before method: run before each test case
	 * after method: run after each test case 
	 * 
	 * before test : visiting
	 *  before class: max
	 *    before method : refresh   tc1: title      aftermethod: cookie deletion
	 *    before method : refresh   tc2: clicking   aftermethod: cookie deletion
	 *  after class : getting url
	 * after test : closing
	 ** 
	 * */
	ChromeDriver ob;
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after method");
		ob.manage().deleteAllCookies();
	}
	
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class" );
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class" + ob.getCurrentUrl());
	}
	@Test
	public void t1()
	{
		System.out.println("test case 1" + ob.getTitle());
	}
	
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");//step1
		System.out.println("before test ");
	}
	
	@AfterTest
	public void at() throws InterruptedException
	{
		System.out.println("after test ");
		Thread.sleep(3000);
		ob.quit();
	}
	
	
	@Test
	public void t2()
	{
		System.out.println("test case 2");
		ob.findElementByLinkText("Images").click();
	}

}
