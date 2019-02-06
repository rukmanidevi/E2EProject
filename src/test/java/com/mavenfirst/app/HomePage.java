package com.mavenfirst.app;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageObject.LandingPage;
import com.pageObject.LoginPage;
import com.resourses.Base;

public class HomePage extends Base {
	
	@BeforeTest
public void initialize() throws IOException {
		driver =InitializeDriver();//-->just we r calling the method in BAse class as it has been inherited here to invoke the driver
		
		System.out.println("Before test in home page initialize");
			
}
	@BeforeTest
	public void beforetest()
	{
	
	log.info("Driver is initialized");
		System.out.println("Before test in home page");
		
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class in home page");
	}
	@Test(dataProvider ="getData")
	
	public void basePageNavigation(String UserName,String Password) 
	{
		  driver.get(p.getProperty("url"));
		  log.info("Navigatedto homePage");
		LandingPage lp=new LandingPage(driver);
		lp.getLogin().
		
		click();
		Reporter.log("iNto BAse Page");
		LoginPage log =new LoginPage(driver);
		log.getUserName().sendKeys(UserName);
		log.getPassWord().sendKeys(Password);
		
		log.getSubmit().click();;
	}
	@AfterTest
	public void browseClose() 
	
	{
		driver.close();
		driver=null;
	}
@DataProvider
public Object[][] getData()
{
	Object[][] data =new Object[2][2];
	data[0][0]="Rukmani";
	data[0][1]="Rukmani";
	data[1][0]="KArthik";
	data[1][1]="Karthik";
	return data;
}
}
