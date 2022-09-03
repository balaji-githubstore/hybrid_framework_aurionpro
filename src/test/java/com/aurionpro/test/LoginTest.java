package com.aurionpro.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aurionpro.base.AutomationWrapper;
import com.aurionpro.pages.LoginPage;
import com.aurionpro.pages.MainPage;
import com.aurionpro.utilities.DataUtils;
import com.aventstack.extentreports.Status;
	
public class LoginTest extends AutomationWrapper {

	@Test(dataProvider = "commonDataProvider", dataProviderClass = DataUtils.class)
	public void validCredentialTest(String username, String password, String expectedTitle) {
		
		LoginPage login=new LoginPage(driver);
		login.enterUsername(username);
		test.log(Status.INFO, "Entered Username: "+username);
		login.enterPassword(password);
		test.log(Status.INFO, "Entered Password: "+password);
		login.clickOnLogin();
		test.log(Status.INFO, "Clicked on Login ");
		MainPage main=new MainPage(driver);
		String actualTitle = main.getMainPageTitle();
		
		test.log(Status.INFO, "Actual Title "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "commonDataProvider")
	public void invalidCredentialTest(String username, String password, String expectedError) {
		
		LoginPage login=new LoginPage(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		String actualError = login.getInvalidErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}

}
