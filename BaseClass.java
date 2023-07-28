package com.airtel.qsp.genericutility;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.airtel.qsp.pomrepository.LogoutTrello;
import com.airtel.qsp.pomrepository.TrelloHomePage;
import com.airtel.qsp.pomrepository.TrelloLoginPage;

public class BaseClass
{
	public WebDriver driver;
	public ExcelUtility excelUtils = new ExcelUtility();
	public FileUtility fileUtils = new FileUtility();
	public JavaUtility javaUtils =new JavaUtility();
	public WebDriverUtility webdriverUtils=new WebDriverUtility();
	
	@BeforeClass
	public void configBeforeMethod() throws IOException 
	{
		String browserName = fileUtils.readCommonData("browser");
		if (browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("edge")) 
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		webdriverUtils.implicitWait(driver);
		driver.get(fileUtils.readCommonData("url"));
	}
	
	@BeforeMethod
	public void login() throws Throwable 
	{
		TrelloHomePage homePage = new TrelloHomePage(driver);
		homePage.getLoginOption().click();
		webdriverUtils.verifyCompleteTitle(driver, driver.getTitle());
		
		TrelloLoginPage login = new TrelloLoginPage(driver);
		webdriverUtils.ActiveElementSendkeys(driver, "username");
		login.getContinueOption().click();
		webdriverUtils.verifyCompleteTitle(driver, "Log in to continue - Log in with Atlassian account");
		webdriverUtils.ActiveElementSendkeys(driver, "password");
		login.getLoginButton().submit();
	}
	
	@AfterMethod
	public void logout() 
	{
		LogoutTrello logout = new LogoutTrello(driver);
		logout.getProfileIcon().click();
		logout.getProfileLogoutButton().click();
		logout.getLogoutSubmitButton().submit();
	}
	
	@AfterClass
	public void configAfterMethod()
	{
		driver.manage().window().minimize();
		driver.quit();
	}
	
}
