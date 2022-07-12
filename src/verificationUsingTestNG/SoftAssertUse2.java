package verificationUsingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse2 {
  @Test
  public void myMethod() 
  {
	  boolean a=true;
	  boolean b=false;
	  
	  SoftAssert s1 = new SoftAssert();
	  
//	  s1.assertTrue(b, "value is false,TC failed");
//	  Reporter.log("value is true, TC Passed");
//	  s1.assertAll();
	  
	  s1.assertFalse(b, "value is true,TC failed");
	  Reporter.log("value is false, TC Passed");
	  s1.assertAll();
  }
}
