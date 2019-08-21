package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	//Create a constructor
	public void TestBase(){
		
		//To Read Property File
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("D:/Selenium/Selenium StuFF/Projects/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
						
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}			
				
	

		public static void initialization(){
			String browserName=prop.getProperty("browser");
			
			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium StuFF\\Softwares\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			else if(browserName.equals("firefox"))	
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium StuFF\\Softwares\\geckodriver-v0.24.0-win32\\geckodriver.exe");
				driver=new FirefoxDriver();	
			}
			
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			
		}
}



