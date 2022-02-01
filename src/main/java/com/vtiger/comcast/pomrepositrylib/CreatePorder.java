package com.vtiger.comcast.pomrepositrylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePorder {

	WebDriver driver;
	public CreatePorder(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath="//img[@alt='Create Purchase Order...']")
	private WebElement Createpr;


	public WebElement getCreatepr() {
		return Createpr;
	}

	public void createporder() {
		
		Createpr.click();
		
	}
	
}
