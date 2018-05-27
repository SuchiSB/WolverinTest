package com.Wolverin.test.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Wolverin.Ui.objects.LoginPage;
import com.Wolverin.test.config.TestConfig;

public class TestStartPageU13679 {
	WebDriver driver;
	LoginPage loginPage;
	//first driver instance will get intialise along with the respective browser
	//then driver ctrl is passed to page object class to identify the elements and proceeds further
	@BeforeMethod
	public void preCondition(){
		driver=TestConfig.getDriverInstance();
		loginPage=new LoginPage(driver);
	}
	@AfterMethod
	public void postCondition(){
		driver.close();
	}
	@Test
	public void testStartPageTC18532(){
		loginPage.waitForLoginPageToLoad();
		//verify title
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Login";
		Assert.assertEquals(actualTitle, expectedTitle);
		//verify login button is enabled
		boolean loginButtonStatus=loginPage.getLoginbutton().isEnabled();
		Assert.assertEquals(loginButtonStatus, true);
		//Verify UN & PWD text box available
		WebElement userNameTextbox=loginPage.getUserNameTextBox();
		Assert.assertNotNull(userNameTextbox);
		WebElement passwordTextbox=loginPage.getPasswordTextBox();
		Assert.assertNotNull(passwordTextbox);
		
	}
	

}
