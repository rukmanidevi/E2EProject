package com.mavenfirst.app;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageObject.LandingPage;
import com.resourses.Base;

public class Validatetile extends Base{
	@BeforeTest
	public void initialize() throws IOException {
			driver =InitializeDriver();//-->just we r calling the method in BAse class as it has been inherited here to invoke the driver
	        driver.get(p.getProperty("url"));
				
	}
		@AfterTest
		public void browseClose() 
		
		{
			driver.close();
			driver=null;
		}
	@Test
	public void basePageNavigation() throws IOException 
	{
		
		LandingPage lp=new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES123");
}
}
