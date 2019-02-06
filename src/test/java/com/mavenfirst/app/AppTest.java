package com.mavenfirst.app;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    }

    /**
     * @return the suite of tests being tested
     */
    public static void click(By by){
    WebElement	ele= findElement(by);
    if(ele.isDisplayed())
    {
    	if(ele.isEnabled())
    		ele.click();
    }
    	
    }

   

	public static WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return findElement(by);
	}

	/**
     * Rigourous Test :-)
     */
    @Test
	public void testApp()
    {
        AssertJUnit.assertTrue( true );
    }
}
