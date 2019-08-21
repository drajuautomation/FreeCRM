package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'Raju D')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;

	
	
	// Initialization
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	
	// Actions

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}

	public ContactsPage verifyContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}

	public DealsPage verifyDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}

	public TasksPage verifyTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}

}
