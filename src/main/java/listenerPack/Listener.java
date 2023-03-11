package listenerPack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
	public void onTestStart(ITestResult r)
	{
		System.out.println("TEST CASE STARTED FOR EXECUTION");
	}
	
	public void onTestSuccess(ITestResult r)
	{
		System.out.println("TEST CASE IS SUCCESSFULLY PASSED");
	}
	
	public void onTestFailure(ITestResult r)
	{
		System.out.println("TEST CASE IS FAILED AND HENCE TAKE SCREENSHOT");
	}

}
