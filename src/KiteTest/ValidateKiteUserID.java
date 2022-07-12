package KiteTest;

import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMNew.KiteHomePage;
import KitePOMNew.KiteLoginPage;
import KitePOMNew.KitePinPage;
import KiteUtility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateKiteUserID extends Base{
 
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	
   @BeforeClass
    public void launchBrowser()
	 {
	   openBrowser();
	   login = new KiteLoginPage(driver);
	   pin = new KitePinPage(driver);
	   home = new KiteHomePage(driver);
	   
	 }
   
   @BeforeMethod
   public void loginToKiteApp() throws EncryptedDocumentException, IOException
   {
	   login.sendUserName(Utility.readDataFromExcel(0, 1));
	   login.sendPassword(Utility.readDataFromExcel(1, 1));
	   login.clickOnLoginButton();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   
	   pin.sendPin(Utility.readDataFromExcel(2, 1));
	   pin.clickOnContinueButton();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
   }

   
  @Test
  public void ValidateUserID() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(0, 1), "Actual and Expeted are not matching, TC failed");
	  
  }
  

  @AfterMethod
  public void logOutFromKite() throws InterruptedException 
  {
	  home.logOut();
  }

 
  @AfterClass
  public void closeBrowser() 
  {
	  driver.close();
  }

}
