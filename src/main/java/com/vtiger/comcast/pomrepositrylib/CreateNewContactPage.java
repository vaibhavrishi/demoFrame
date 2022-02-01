package com.vtiger.comcast.pomrepositrylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutility.WebDriverUtility;

public class CreateNewContactPage extends WebDriverUtility {


	WebDriver driver;

	public CreateNewContactPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(name="lastname")

	private WebElement Lastname;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLastname() {
		return Lastname;
	}
	
	
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
	
	private WebElement OrgName;
	



	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	
	private WebElement savebutton;

	
	
	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getOrgName() {
		return OrgName;
	}
	
	
	

	public void createcontact(String contactname){
		Lastname.sendKeys(contactname);
		savebutton.click();
	}
	
	public void createcontactwithOrg(String contactnamefororg,WebDriver driver,String orgnameforcnt){
		OrgName.click();
		switchToWindow(driver,"Accounts");

		OrganizationsPage onp = new OrganizationsPage(driver);
		onp.getSearchtext().sendKeys(orgnameforcnt);
		onp.getSearchbtn().click();
	    driver.findElement(By.xpath("//a[text()='"+orgnameforcnt+"']")).click();
	    switchToWindow(driver,"EditView");
	    Lastname.sendKeys(contactnamefororg);
	    savebutton.click();
	   
	    
	    
	    
	    
	    
	    
	}
	
}
	

		
	 

	
	






