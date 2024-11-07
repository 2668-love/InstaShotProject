package com.ecommerce.instashot.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ecommerce.instashot.GenericLibrary.BaseTest;

public class VerifyKidsProduct extends BaseTest
{
	@Test(priority=1)
	public void createproduct()
	{
		Reporter.log("kids product created",true);
	}
	@Test(priority=2,invocationCount = 2,dependsOnMethods ="createproduct",enabled = false)
	public void Updateproduct()
	{
		Reporter.log("kids product updated",true);
	}
}
