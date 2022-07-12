package KiteTest;

import org.testng.annotations.Test;

import KiteBase.BaseNew;
import KitePOMNew.KiteHomePage;
import KitePOMNew.KiteLoginPage;
import KitePOMNew.KitePinPage;
import KiteUtility.UtilityProp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
@Listeners(ListenerStudy.ListenerClass.class)
public class ValidateKiteUserIDUsingProperty extends BaseNew{
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	String TCID="1234";
	
	@BeforeClass
	public void lauchBrowser() throws IOException
	{
		openBrowser();
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);
		
	}

  @BeforeMethod
  public void loginToKiteApp() throws IOException 
  {
	  login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
	  login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
	  login.clickOnLoginButton();
	  
	  pin.sendPin(UtilityProp.getDataFromPropertyFile("Pin"));
	  pin.clickOnContinueButton();
  }
  
  @Test
  public void validateUserID() throws IOException
  {
	  Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"), "Actual And Expected are not matching,TC failed");
	  UtilityProp.captureScreenshot(driver, TCID);
  }

  @AfterMethod
  public void logOutFromKiteApp() throws InterruptedException 
  {
	  home.logOut();
  }


  @AfterClass
  public void closeBrowser() 
  {
	  driver.close();
  }

}
