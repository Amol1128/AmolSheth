package KitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
 
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
			
		 ChromeOptions opt = new ChromeOptions();
//		 opt.addArguments("headless");
//		 opt.addArguments("disable-notifications");
		 opt.addArguments("incognito");
		 
		 driver = new ChromeDriver(opt);
		 driver.manage().window().maximize();
		 
		 driver.get("https://kite.zerodha.com/");
		 Reporter.log("Launching Browser",true);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 File myfile = new File("D:\\My Excel File\\myKiteExcel.xlsx");
	     mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	     
	     login = new KiteLoginPage(driver);
	     pin = new KitePinPage(driver);
	     home = new KiteHomePage(driver);   
	}
	
	@BeforeMethod
	public void loginToKiteApp()
	{
		String UN = mySheet.getRow(0).getCell(1).getStringCellValue();
		String PWD = mySheet.getRow(1).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(2).getCell(1).getStringCellValue();
		
		login.sendUserName(UN);
		Reporter.log("sending UserName",true);
		login.sendPassword(PWD);
		Reporter.log("sending PassWord",true);
		login.clickOnLoginButton();
		Reporter.log("Clicking on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)); 
		
		pin.sendPin(PIN);
		Reporter.log("sending PIN",true);
		pin.clickOnContinueButton();
		Reporter.log("Clicking on continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
	@Test
    public void validateUserName()
	{
		String expectedUN = mySheet.getRow(0).getCell(1).getStringCellValue();
		String actualUN = home.getActualUserName();
		Reporter.log("Validating UserName",true);
		Assert.assertEquals(actualUN, expectedUN, "Actual and Expected UN are not Matching, TC failed");
        Reporter.log("Actual and Expected UN are Matching, TC Passed",true);
	
	}
	
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException
	{
		home.logOut();
		Reporter.log("logging out...",true);
	} 
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
	Thread.sleep(2000);
	Reporter.log("Closing Browser",true);
	driver.close();
	
	}
	
}
