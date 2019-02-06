package com.mavenfirst.app;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageObject.LandingPage;
import com.resourses.Base;

 
public class ValidateNavBar extends Base{
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
			driver =InitializeDriver();//-->just we r calling the method in BAse class as it has been inherited here to invoke the driver
			log.info("Driver is initialized");
	        driver.get(p.getProperty("url"));
	        log.info("Navigatedto homePage");
				
	}
	@AfterTest
	public void browseClose() 
	
	{
		driver.close();
		driver=null;
		log.info("Browser got closed");
	}	
	@Test
	public void basePageNavigation() throws IOException 
	{
		
		LandingPage lp=new LandingPage(driver);
		
		Assert.assertTrue(lp.getNavBar().isDisplayed());
		log.debug("Checked the Navigation Bar");
}
}