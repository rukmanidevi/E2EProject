package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public WebDriver driver;
By login = By.cssSelector("a[href*='sign_in']");
By navBar =By.cssSelector(".nav.navbar-nav.navbar-right");
By title =By.cssSelector(".text-center>h2");
public LandingPage(WebDriver driver) {
	this.driver =driver;
}
public WebElement getLogin() {
	
	 return driver.findElement(login);
	
}
public WebElement getNavBar() {
	return driver.findElement(navBar);
	
}
public WebElement getTitle() {
	return driver.findElement(title);
	
}
}
