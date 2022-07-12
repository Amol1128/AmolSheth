package TestNG_Study01;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Study {
  @Test
  public void validateUserID()
  {
	  Reporter.log("User ID Validated",true);
  }
  
  @Test 
  public void validateDashBoard()
  {
	  Reporter.log("DashBoard Validated",true);
  }
  
  @BeforeMethod
  public void loginToKiteApp()
  {
	  Reporter.log("Login Success",true);
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Browser Launched",true);
  }
  
  @AfterMethod
  public void logOutFromKiteApp()
  {
	  Reporter.log("Logging out..",true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser Closed",true);
  }
  
  
  
  
  
}
