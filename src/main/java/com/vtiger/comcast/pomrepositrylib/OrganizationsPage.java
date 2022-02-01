package com.vtiger.comcast.pomrepositrylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {

	public OrganizationsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")

	private WebElement organplusimg;

	public WebElement getOrganplusimg() {
		return organplusimg;
	}

	@FindBy(name="search_text")

	private WebElement searchtext;

	public WebElement getSearchtext() {
		return searchtext;
	}
	@FindBy(name="search")

	private WebElement searchbtn;

	public WebElement getSearchbtn() {
		return searchbtn;
	}

}
