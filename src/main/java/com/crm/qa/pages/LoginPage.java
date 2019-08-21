package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	HomePage homePage;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement SignIn;
	
	@FindBy(xpath="//*[contains(text(),'Sign Up')]")
	WebElement SignUp;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement crmLogo;
	
	
	
	//Initialising the Page Objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
//	Action
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public boolean validateCRMLogo()
	{
		return crmLogo.isDisplayed();
	}
	
	
	public HomePage login(String un,String pwd)
	{
		username.sendKeys("un");
		password.sendKeys("pwd");
		SignIn.click();
		
		return new HomePage();
		
	}
}
 