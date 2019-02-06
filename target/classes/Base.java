package com.resourses;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.Logger;
import com.google.common.io.Files;

public class Base {
	public  static WebDriver driver=null;
	public static Logger log=null;
	public Properties p =null;
	public  WebDriver InitializeDriver() throws IOException {
		// TODO Auto-generated method stub
		 

	p=new Properties();
	FileInputStream fil =new FileInputStream("C:\\Users\\karth\\E2EProject\\src\\main\\java\\com\\resourses\\data.properties");
	p.load(fil);
	String browserName =p.getProperty("browser");
	if(browserName.equals("chrome"));
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
	}
	 if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.firefox.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
	}
	else if(browserName.equals("IE"))
	{
		
	}
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
public void getScreenshot(String result) throws IOException 
{
System.out.println("Inside screenshot");
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
Files.copy(src, new File("C://test//"+ result +"screenshot.png"));


}
public Logger log4() {
	 Logger log=LogManager.getLogger(Base.class.getName());
	 return log;
}
}

