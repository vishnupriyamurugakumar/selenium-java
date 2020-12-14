package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult results) {
		System.out.println("Starting");
	}
	
	@Override
	public void onTestSuccess(ITestResult results) {
		System.out.println("success");
	}
	
	@Override
	public void onTestFailure(ITestResult results) {
		System.out.println("failure");
	}

	@Override
	public void onTestSkipped(ITestResult results) {
		System.out.println("skipped");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult results) {
		System.out.println("Before everything");
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Before everything");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Before everything");
	}
}
