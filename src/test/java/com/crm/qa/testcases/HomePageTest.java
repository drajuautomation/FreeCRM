package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;

public class HomePageTest extends TestBase {
	
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	TasksPage tasksPage;
	
	public HomePageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		loginPage=new LoginPage();
		contactsPage=new ContactsPage();
		dealsPage=new DealsPage();
		tasksPage=new TasksPage();
		
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	@Test
	public void HomePageTitleTest()
	{
		String homePageTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Title is not Matched");
	}
	
	@Test
	public void verifyUserNameTest()
	{
		homePage.verifyCorrectUserName();
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	

	@Test
	public void verifyContactsLinkTest()
	{
		contactsPage=homePage.verifyContactsLink();
		
	}
	
	
	@Test 
	public void verifyDealsLinkTest()
	{
		dealsPage=homePage.verifyDealsLink();
	}
	
	
	@Test
	public void verifyTasksLinkTest()
	{
		tasksPage=homePage.verifyTasksLink();
	}
	
	
	
	@BeforeTest
	public void tearDdown()
	{
		driver.quit();
	}
}
