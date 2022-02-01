package com.vtiger.comcast.pomrepositrylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct {
	
	WebDriver driver;

public AddProduct(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(name="productname")
	private WebElement ProdName;

	public WebElement getProdName() {
		return ProdName;
	}

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement Save;


	public WebElement getSave() {
		return Save;
	}


	public void addproduct(String productname) {
		
		ProdName.sendKeys(productname);
		Save.click();
	}

	
}
