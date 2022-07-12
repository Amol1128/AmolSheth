package ListenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerClass implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test passed successfully");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test skipped");
	}

}
