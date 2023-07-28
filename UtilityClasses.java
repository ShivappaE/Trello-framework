package com.trello.qsp.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	/**
	 *
	 * This method will be used to read the String data from excel workbook 
	 * @author Shiv
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return cellStringValue
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String readStringData(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/test/resources/trelloworkbook.xlsx"));
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	}

	/**
	 * 
	 * This method will be used to read the String data from excel workbook 
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return cellNumericValue
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public double readNumericData(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/test/resources/trelloworkbook.xlsx"));
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
	}
}

=======================================================================================================================================================================


package com.trello.qsp.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * This class will be used manage the Propertyfile/Filehandling
 * @author QCSM20
 *
 */
public class FileUtility 
{
	/**
	 *
	 * This will bring the value from the propertyfile upon supplying the key as an input
	 * @param key
	 * @return value
	 * @author Shivappa
	 * @throws IOException
	 * 
	 */
	public String readCommonData(String key) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/trellodata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
	}

}

==============================================================================================================================================

package com.trello.qsp.genericutility;

import java.time.LocalDateTime;

public class JavaUtility 
{
	public String timeStamp()
	{
		return LocalDateTime.now().toString().replace(':', '-');	
	}

}

==============================================================================================================================================================

package com.trello.qsp.genericutility;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility 
{
	
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public boolean verifyCompleteTitle(WebDriver driver,String expectedTitle)
	{
		return new WebDriverWait(driver,  Duration.ofSeconds(5)).until(ExpectedConditions.titleIs(expectedTitle));
	}

	public boolean verifyPartialTitle(WebDriver driver,String partialTitle)
	{
		return new WebDriverWait(driver,  Duration.ofSeconds(5)).until(ExpectedConditions.titleContains(partialTitle));
	}
	
	public WebDriver switchFrameAsElement(WebDriver driver,WebElement frameElement)
	{
		return driver.switchTo().frame(frameElement);
	}
	
	public void alertButton(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void ActiveElementSendkeys(WebDriver driver,String value) throws IOException 
	{
		driver.switchTo().activeElement().sendKeys(new FileUtility().readCommonData(value));
	}
	public WebElement elementToBeClickable(WebDriver driver,WebElement element)
	{
		return new WebDriverWait(driver,  Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(element));
	}
}

==============================================================================================================================================================
