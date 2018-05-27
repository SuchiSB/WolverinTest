package com.Wolverin.test.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Wolverin.Ui.objects.LoginPage;
import com.Wolverin.test.config.TestConfig;

public class TestLoginU13857 {
	WebDriver driver;
	LoginPage loginPage;
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
	public void testStartPageTC184765(){
		loginPage.waitForLoginPageToLoad();
		loginPage.getUserNameTextBox().sendKeys("admin");
		loginPage.getPasswordTextBox().sendKeys("invalid");
		loginPage.getLoginbutton().click();
		String actualErrMsg=loginPage.getLoginErrorMessage().getText();
		String expectedErrMsg="Username or Password is invalid. "+"Please try again.";
		Assert.assertEquals(actualErrMsg,expectedErrMsg);

}
}
