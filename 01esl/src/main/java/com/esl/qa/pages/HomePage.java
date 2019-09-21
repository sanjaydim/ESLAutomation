package com.esl.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.esl.qa.base.Testbase;

public class HomePage extends Testbase {

	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	

}
