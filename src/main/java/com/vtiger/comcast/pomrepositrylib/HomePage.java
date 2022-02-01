package com.vtiger.comcast.pomrepositrylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


	//constructor
	WebDriver driver;
	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText="Organizations")
	private WebElement organizationlnk;

	@FindBy(linkText="Contacts")
	private WebElement contactslnk;
	
	@FindBy(linkText="Products")
	private WebElement ProductSlink;


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProductSlink() {
		return ProductSlink;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstrator;

	@FindBy(linkText="Sign Out")	
	private WebElement signoutlnk;

	public WebElement getSignoutlnk() {
		return signoutlnk;
	}

	public WebElement getOrganizationlnk() {
		return organizationlnk;
	}

	public WebElement getContactslnk() {
		return contactslnk;
	}

	public WebElement getAdminstrator() {
		return adminstrator;
	}

	public void logout() {

		Actions act = new Actions(driver);
		act.moveToElement(adminstrator).perform();
		signoutlnk.click();
	}



}