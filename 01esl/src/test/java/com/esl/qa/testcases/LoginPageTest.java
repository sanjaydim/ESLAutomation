package com.esl.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.esl.qa.base.Testbase;
import com.esl.qa.pages.HomePage;
import com.esl.qa.pages.LoginPage;

public class LoginPageTest extends Testbase{
	 
	LoginPage loginpage;
	HomePage homepage;

	
	public LoginPageTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test
	public void LogInTest() throws IOException {
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	

}
