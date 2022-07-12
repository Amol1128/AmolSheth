package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void myMethod()
  {
	  String a=null;
	  String b="Amol";
	  
//	  Assert.assertNull(a, "TC Failed, Value is not null");
//	  Reporter.log("TC passed, Value is null",true);
	  
	  Assert.assertNotNull(a, "TC failed, Value is null");
	  Reporter.log("TC passed, Value is not null",true);
	  
	  Assert.fail();
  }
}
