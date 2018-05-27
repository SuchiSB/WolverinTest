package com.Wolverin.Ui.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
		}
	//wait for pageto Load
	public void waitForLoginPageToLoad(){
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("LoginForm")));
	}
	//find Usernametext box
	public WebElement getUserNameTextBox(){
		WebElement element=driver.findElement(By.name("username"));
		return element;
	}
	//find Password text box
	public WebElement getPasswordTextBox(){
		return driver.findElement(By.name("pwd"));
}
	//Find Login button
	public WebElement getLoginbutton(){
		return driver.findElement(By.cssSelector("input[type='submit']"));
}
	//Find login Error message
	public WebElement getLoginErrorMessage(){
		return driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]"));
}
}
	
	
