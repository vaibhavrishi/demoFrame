package com.vtiger.comcast.pomrepositrylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement Addproductslink;


	public WebElement getAddproductslink() {
		return Addproductslink;
	}
	
	


}
