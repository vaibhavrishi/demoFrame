package com.vtiger.comcast.pomrepositrylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutility.WebDriverUtility;

public class CreateNewPrder extends WebDriverUtility {

	WebDriver driver;

	public CreateNewPrder(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(name="subject")
	private WebElement SubName;


	public WebElement getSubName() {
		return SubName;
	}

	@FindBy(xpath="//img[@alt='Select']")
	private WebElement addvendor;

	public WebElement getaddvendor() {
		return addvendor;
	}

	@FindBy(name="bill_street")
	private WebElement Baddress;

	public WebElement getBaddress() {
		return Baddress;

	}
	@FindBy(name="ship_street")
	private WebElement Saddress;

	public WebElement getSaddress() {
		return Saddress;
	}
	@FindBy(id="searchIcon1")
	private WebElement prodsrchbtn;

	public WebElement getProdsrchbtn() {
		return prodsrchbtn;
	}
	public void setProdsrchbtn(WebElement prodsrchbtn) {
		this.prodsrchbtn = prodsrchbtn;
	}
	@FindBy(name="search_text")
	private WebElement ChildWind1txt;

	@FindBy(name="search")
	private WebElement ChildWind1btn1;

	@FindBy(className="txtBox")
	private WebElement ChildWind2txt;


	@FindBy(xpath="//input[@type='button']")
	private WebElement ChildWind2btn2;

	public WebElement getChildWind1txt() {
		return ChildWind1txt;
	}
	public WebElement getChildWind1btn1() {
		return ChildWind1btn1;
	}
	public WebElement getChildWind2txt() {
		return ChildWind2txt;
	}
	public WebElement getChildWind2btn2() {
		return ChildWind2btn2;
	}

	@FindBy(name="qty1")
	private WebElement qntty;


	public WebElement getQntty() {
		return qntty;
	}


	@FindBy(className="crmbutton small save")
	private WebElement submitbtn;



	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public void createnewporder(String subname,String biladdrs,String shipaddrs,String vndrname,String productname ) {

		SubName.sendKeys(subname);
		Baddress.sendKeys(biladdrs);
		Saddress.sendKeys(shipaddrs);

		

		addvendor.click();
		switchToWindow(driver,"Vendors&action");
		ChildWind1txt.sendKeys(vndrname);
		ChildWind1btn1.click();
		driver.findElement(By.xpath("//a[text()='"+vndrname+"']")).click();

		switchToWindow(driver,"PurchaseOrder&action");

		
		prodsrchbtn.click();
		switchToWindow(driver,"Products&action");
		ChildWind2txt.sendKeys(productname);
		ChildWind2btn2.click();
		driver.findElement(By.xpath("//a[text()='"+productname+"']")).click();

		switchToWindow(driver,"PurchaseOrder&action");
		//qntty.sendKeys(quantity);
		submitbtn.click();
		
		
	}


}




