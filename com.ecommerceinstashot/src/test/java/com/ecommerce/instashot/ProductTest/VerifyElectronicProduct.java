package com.ecommerce.instashot.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ecommerce.instashot.GenericLibrary.BaseTest;

public class VerifyElectronicProduct extends BaseTest
{
	@Test(priority=1)
	public void createproduct()
	{
		Reporter.log("electronics product created",true);
	}
	@Test(priority=2,invocationCount = 2,dependsOnMethods ="createproduct")
	public void Updateproduct()
	{
		Reporter.log("electronics product updated",true);/
	}

}
