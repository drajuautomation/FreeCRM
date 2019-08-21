package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{

	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;


//	Initialization
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
//	Actions
	public boolean validateContactsLable()
	{
		return contactsLabel.isDisplayed();
	}
	
	
	
	
}



