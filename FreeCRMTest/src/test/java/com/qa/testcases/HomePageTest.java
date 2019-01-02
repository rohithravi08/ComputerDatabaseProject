package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;

public class HomePageTest extends TestBase{

	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		initialization();
		homepage=new HomePage();		
	}
	
	@Test
	public void homepageTitleValidation() {
		String title=homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Computers database");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
}
