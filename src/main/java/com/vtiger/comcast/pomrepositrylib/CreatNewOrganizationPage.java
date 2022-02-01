package com.vtiger.comcast.pomrepositrylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutility.WebDriverUtility;

public class CreatNewOrganizationPage extends WebDriverUtility {

	WebDriver driver;
	
	public CreatNewOrganizationPage(WebDriver driver) {
		
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(name="accountname")

	private WebElement orgName;

	public WebElement getOrgname() {
		return orgName;
	}
	
	
	@FindBy(name="industry")
	private WebElement industype;
	


	public WebElement getIndustype() {
		return industype;
	}

	@FindBy(xpath="//input[@title='Save [Alt+S]']")

	private WebElement savebtn;
	
	

	public WebElement getSavebtn() {
		return savebtn;
	}


	
	
	@FindBy(name="industry")

	private WebElement industryDdown;
	
	

	public WebElement getindustryDdown() {
		return industryDdown;
		
		
	}

	
	
	
	public void createOrgan(String orgname)
	{
		orgName.sendKeys(orgname);
		savebtn.click();
	}
	
	

	public void createOrganWithEdu(String orgnameforEdu)
	{
		orgName.sendKeys(orgnameforEdu);
		WebElement ele1 = industryDdown;
		select(ele1, "Education");
		
		savebtn.click();
	    //waitForVisibility(driver,savebtn );
		
	}
	

	public void createOrgforcnt(String orgnameforcnt)
	{
		orgName.sendKeys(orgnameforcnt);
		savebtn.click();
	}
	

	
	
}
	
	
	
	
	
	

