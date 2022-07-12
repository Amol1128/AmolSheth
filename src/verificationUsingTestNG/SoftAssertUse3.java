package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse3 {
  @Test
  public void myMethod() 
  {
	  String a=null;
	  String b="Amol";
	  
	  SoftAssert s2 = new SoftAssert();
	  
//    s2.assertNull(a, "TC Failed, Value is not null");
//	  Reporter.log("TC passed, Value is null",true);
	  
	  s2.assertNotNull(b, "TC failed, Value is null");
	  Reporter.log("TC passed, Value is not null",true);
	  
//       s2.fail();
	  
	   s2.assertAll();
  }
}
