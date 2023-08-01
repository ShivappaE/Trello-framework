package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginPage
{
	WebDriver driver;

	public TrelloLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "login")
	private WebElement ContinueButton;
	public WebElement getContinueOption() 
	{
		return ContinueButton;
	}
	
	@FindBy(id = "password")
	private WebElement passwordTextField;
	public WebElement getPasswordTextField() 
	{
	
		return passwordTextField;
	}
	
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement LoginButton;
	public WebElement getLoginButton() 
	{
		return LoginButton;
	}
	
	
	
}

==========================================================================

package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloWelcomePage
{
	WebDriver driver;
	
	public TrelloWelcomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()='Create']")
	private WebElement createOption;

	public WebElement getCreateOption() 
	{
		return createOption;
	}
	
	@FindBy(xpath = "//button[@data-testid='header-create-board-button']")
	private WebElement createBoardButton;

	public WebElement getCreateBoardButton() 
	{
		return createBoardButton;
	}
	
	@FindBy(xpath = "//button[@data-testid='create-board-submit-button']")
	private WebElement createBoardSubmitButton;

	public WebElement getBoardSubmitButton() 
	{
		return createBoardSubmitButton;
	}
		
	
}

==============================================================================================================

package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePage
{
	WebDriver driver;
	
	public TrelloHomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//DIV[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/A[@href='/login']")
	private WebElement loginOption;

	public WebElement getLoginOption() {
		return loginOption;
	}

}

=====================================================================================================================

package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteTrelloBoard
{
	WebDriver driver;
	
	public DeleteTrelloBoard(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-label='Show menu' and @type='button']")
	private WebElement menuOption;
	public WebElement getMenuOption() 
	{
		return menuOption;
	}
	
	@FindBy(xpath = "(//li[@class='board-menu-navigation-item'])[4]")
	private WebElement moreOption;

	public WebElement getMoreOption() 
	{
		return moreOption;
	}
	
	@FindBy(xpath = "//a[@class='board-menu-navigation-item-link js-close-board']")
	private WebElement closeBoardOption;

	public WebElement getCloseBoardOption() 
	{
		return closeBoardOption;
	}
	
	@FindBy(xpath = "//input[@class='js-confirm full nch-button nch-button--danger']")
	private WebElement closeButton;

	public WebElement getCloseButton() 
	{
		return closeButton;
	}
	
	@FindBy(xpath = " //button[@data-testid='close-board-delete-board-button']")
	private WebElement deleteButton;

	public WebElement getDeleteButton() 
	{
		return deleteButton;
	}
	
	@FindBy(xpath = " //button[@data-testid='close-board-delete-board-confirm-button']")
	private WebElement deleteConfirmButton;

	public WebElement getDeleteConfirmButton() 
	{
		return deleteConfirmButton;
	}
	
	
}

=========================================================================================================================================

package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutTrello
{

	WebDriver driver;
	
	public LogoutTrello(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "span[title='Shivappa E (shivappae)']")
	private WebElement profileIcon;

	public WebElement getProfileIcon() 
	{
		return profileIcon;
	}
	
	@FindBy(css = "div.atlaskit-portal > section > div > div > div > div:nth-of-type(3)")
	private WebElement profileLogoutBuuton;

	public WebElement getProfileLogoutButton() 
	{
		return profileLogoutBuuton;
	}
	
	@FindBy(xpath = "//BUTTON[@id='logout-submit']/SPAN[.='Log out']")
	private WebElement LogoutSubmitButton;

	public WebElement getLogoutSubmitButton() 
	{
		return LogoutSubmitButton;
	}
	
}

=======================================================================================================================================



