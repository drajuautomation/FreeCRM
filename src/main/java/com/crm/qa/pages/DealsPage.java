package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase{
	
	HomePage homePage;
	DealsPage dealsPage;
	
	@FindBy(xpath="//a[contains(text(),'Deal')]")
	WebElement dealsPageLink;
	
	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement newDealsPageLink;
	
	@FindBy(xpath="//legend[contains(text(),'Deal')]")
	WebElement dealsText;
	
	@FindBy(xpath="//table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/*")
	WebElement dealNo;
	
	@FindBy(name="title")
	WebElement newDealsTitle;
	
	
	//Initialisation
	public void DealsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
//	public DealsPage verifyNewDealsLinkTest()
//	{
//		homePage.clickOnNewDealsLink();
//		return new DealsPage();
//	}

	public boolean verifyDealsLable()
	{
		 return dealsPage.dealsText.isDisplayed();
	
	}
	

	public void clickOnDealsNo()
	{
//		dealsPage.dealNo.click();
		Actions action=new Actions(driver);
		action.doubleClick(dealsPage.dealNo).build().perform();		
//		action.contextClick(dealsPage.dealNo);
//		action.contextClick(dealsPage.newDealsTitle).build().perform();
	
	}
	
	
	
}
