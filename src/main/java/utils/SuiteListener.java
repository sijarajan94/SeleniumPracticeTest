package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import base.BaseTest;

public class SuiteListener implements ITestListener,IAnnotationTransformer{

	public void onTestFailure(ITestResult result) {
		String filename=System.getProperty("user.dir")+File.separator+"screenshots"+result.getMethod().getMethodName();
		File file= ((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file, new File(filename+".png"));}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	  public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		   annotation.setRetryAnalyzer(RetryAnalyzer.class);
		   
		  }


	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	
}
