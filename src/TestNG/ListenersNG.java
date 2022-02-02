package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersNG implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test is started = "+result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test succesfully run = "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) { 
		System.out.println("Test is failed = "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped = "+result.getName());
	}

	public void onStart(ITestResult context) {
		System.out.println("started = "+context.getName());
	}

	public void onFinish(ITestResult context) {
		System.out.println("Test is Finished = "+context.getName());
	}

}