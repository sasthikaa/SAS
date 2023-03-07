package extras;

import org.openqa.selenium.chrome.ChromeDriver;

public class xxx {
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ce=new ChromeDriver();
		ce.get("http://www.mycontactform.com");
		//1.following
		//2.preceding
		
		//3.parent
		//4.child
		
		//5.following-sibling
		//6.preceding-sibling
		
		//7.ancestor
		//8.descendent
		
		// username=> pass
		//ce.findElementByXPath("//*[@id='user']//following::input").sendKeys("hi");
		
		//passq=> user
		//ce.findElementByXPath("//*[@id='pass']//preceding::input").sendKeys("hi");
		
		//  parent=> child 
		//ce.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[4]").click();
		
		// child=> parent
		//ce.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[2]//parent::div");
		
		
		
		

	    //sibings: child of same parent 
		//ce.findElementByXPath("//*[@id='right_col_middle']//following-sibling::a").click();
		// s = ce.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[2]//preceding-sibling::p").getText();
		//System.out.println(s);
		
	
		// grandchild=> grandparent => ancestor=> //*[@id="right_col_bottom"]/p[2]//ancestor::div
		//granparent=> grandchild => descendent=> //*[@id="right_col_wrapper"]//descendant::div[3]
		
		

	}

}
