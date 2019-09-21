package com.esl.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.esl.qa.base.Testbase;
import com.esl.qa.pages.HomePage;
import com.esl.qa.pages.LoginPage;

public class HomePageTest extends Testbase {
	
	HomePage homepage;
	public HomePageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		homepage = new HomePage();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	

}
