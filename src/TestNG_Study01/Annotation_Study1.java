package TestNG_Study01;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Study1 {
  @Test
  public void rechargePhone() 
  {
	  Reporter.log("Recharge done",true);
  }
  @BeforeMethod
  public void loginToRechargePortal() 
  {
	  Reporter.log("Login Success",true);
  }
  @AfterMethod
  public void logoutFromRechargePortal() 
  {
	  Reporter.log("Logout done",true);
  }
  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("Browser Launched",true);
  }
  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("Browser closed",true);
  }
  
  
  
}
