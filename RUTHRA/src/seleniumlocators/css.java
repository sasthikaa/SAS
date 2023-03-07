package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class css {
public static void main(String[] args) {
	//css: cascade style sheet
	// manual: 7 ways
	// shorcut: copy=> copy selector
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	//visit
	c.get("http://www.mycontactform.com");
	// 1. tagname and id    :   syntax: tagname#id
	//c.findElementByCssSelector("input#user").sendKeys("hi");
	
	//2. tagname and class name:    syntax: tagname.classname
	//c.findElementByCssSelector("input.txt_log").sendKeys("hi");
	
	//3. tagname and attribute   syntax: tagname[attribute='value']
	//c.findElementByCssSelector("input[type='text']").sendKeys("hi");
	
	//4.tagnme, classname and attribute  syntax: tagname.classname[attribute='value']
	//c.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
	
	//5.tagname and prefix   syntax: tagname[attribute^='prefx value']
	//c.findElementByCssSelector("input[type^='te']").sendKeys("hi");
	
	//6.tagname and suffix   syntax: tagname[attribute$='suffx value']
	//c.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
	
	//7.tagname and substring   syntax: tagname[attribute*='substring value']
	//c.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
	
	// copy=> copy selectpr
	c.findElementByCssSelector("#user").sendKeys("hi");
}
}
