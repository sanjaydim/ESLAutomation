package com.esl.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.esl.qa.base.Testbase;

public class LoginPage extends Testbase {


	@FindBy(id="txtUserName")
	WebElement username;

	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"btnlogin\"]")
	WebElement login;
	
	public LoginPage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pass) throws IOException {
		
		username.sendKeys(un);
		password.sendKeys(pass);
		login.click();
		return new HomePage();
	}
	
}	
		
	
