package com.vtiger.comcast.pomrepositrylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseOverpage {
	WebDriver driver;

public MouseOverpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(xpath="//td[@class='tabUnSelected']//a[contains(text(),'More')]")
	private WebElement Mouseovr;


	public WebElement getMouseovr() {
		return Mouseovr;
	}

	@FindBy(name="Purchase Order")
	private WebElement Purchaseord;

	public WebElement getPurchaseord() {
		return Purchaseord;
	}

public void mouseover() {
	
	WebElement ele = driver.findElement(By.xpath("//td[@class='tabUnSelected']//a[contains(text(),'More')]"));
	
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	Purchaseord.click();
	
	
}
	
	
}
