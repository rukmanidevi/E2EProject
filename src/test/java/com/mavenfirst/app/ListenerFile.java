package com.mavenfirst.app;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.resourses.Base;

public class ListenerFile  extends Base implements ITestListener{
	public static Logger log=LogManager.getLogger(Base.class.getName());

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("On Test Start");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("On test Success");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stubdec                                                                                 
		log.info("On test failure");
		try {
			System.out.println("On test failure");
			getScreenshot(result.getName());
			Reporter.log("<br>  <img src='"+result+"' height='100' width='100' /><br>");
			Reporter.log("<a href="+result+"></a>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("On test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("onTestFailedButWithinSuccessPercentage");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		log.info("on Start");
	}

	public void onFinish(ITestContext context) {
		log.info("on Finish");
		
	}

}
