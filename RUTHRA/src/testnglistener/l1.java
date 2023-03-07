package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener=> builtin interface 
	//onstart, onfinish, ontestsuccess, ontestfailure, ontestskipped
	//class and interface
	//class => implements interfacename
	//rightclick=> source=> override/implement methods

public class l1 implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

System.out.println("Test case is failed");
	}

	@Override
	public void onStart(ITestContext context) {

System.out.println("started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finished");
	}
	
}
