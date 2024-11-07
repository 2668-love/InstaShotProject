package com.ecommerce.instashot.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
	@BeforeClass
	public void BrowserSetUp()
	{
		Reporter.log("Browser launched successfully",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login successfull",true);
	}
	@AfterClass
	public void TerminateBrowser()
	{
		Reporter.log("Browser closed successfully",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout successfully",true);
	}
}
