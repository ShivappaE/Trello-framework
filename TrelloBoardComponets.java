package com.airtel.qsp.endtoend;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.airtel.qsp.genericutility.BaseClass;
import com.airtel.qsp.pomrepository.DeleteTrelloBoard;
import com.airtel.qsp.pomrepository.TrelloWelcomePage;

public class TrelloBoardComponets extends BaseClass
{
	@Test
	public void createDeleteListInBoard() throws Throwable 
	{
		//verifying welcomepage title
		webdriverUtils.verifyCompleteTitle(driver, driver.getTitle());
		
		TrelloWelcomePage welcomePage = new TrelloWelcomePage(driver);
		welcomePage.getCreateOption().click();
		welcomePage.getCreateBoardButton().click();;
		webdriverUtils.ActiveElementSendkeys(driver, "boardname");
		WebElement create = welcomePage.getBoardSubmitButton();
		webdriverUtils.elementToBeClickable(driver,create).click();
		
		DeleteTrelloBoard delete = new DeleteTrelloBoard(driver);
		delete.getMenuOption().click();
		delete.getMoreOption().click();
		delete.getCloseBoardOption().click();
		delete.getCloseButton().click();
		delete.getDeleteButton().click();
		delete.getDeleteConfirmButton().click();	
	}	
}
