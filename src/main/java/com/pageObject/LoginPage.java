package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	By email =By.cssSelector("input[id='user_email']");
	By pass =By.cssSelector("input[id='user_password']");
	By logIn=By.cssSelector("input[type='submit']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getUserName()
	{
		return driver.findElement(email);
		
		
		// Comment introduced
	}
	public WebElement getPassWord() {
	
		return driver.findElement(pass);
	}
	
	public WebElement getSubmit() {
		
		return driver.findElement(logIn);
	}
}
