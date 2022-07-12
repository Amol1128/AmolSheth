package verificationUsingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse1 {
  @Test
  public void MyMethod() 
  {
	  String a="Pune";
	  String b="Pune";
	  
	  SoftAssert s = new SoftAssert();
//	  s.assertEquals(a, b, "a and b are not equal,TC failed");
//	  Reporter.log("a and b are equal,TC passed");
	  
	  s.assertNotEquals(a, b, "a and b are equal,TC failed");
	  Reporter.log("a and b are not equal,TC passed");
	  
	  s.assertAll();
  }
}
