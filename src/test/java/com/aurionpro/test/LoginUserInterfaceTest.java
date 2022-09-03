package com.aurionpro.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aurionpro.base.AutomationWrapper;
import com.aurionpro.pages.LoginPage;

public class LoginUserInterfaceTest extends AutomationWrapper {
	
	
	@Test
	public void applicationDescTest()
	{
		LoginPage loginPage=new LoginPage(driver);
		String actualDesc=loginPage.getApplicationDescription();	
		
		Assert.assertEquals(actualDesc, "The most popular open-source Electronic Health Record and Medical Practice Management solution.");	
	}

	
}
