package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod() 
  {
	  String a="Nashik"; 
	  String b="nashik";
	  
//	  Assert.assertEquals(a, b,"a and b values are not matching, TC Failed");
//	  Reporter.log("a and b values are matching, TC Passed",true);
	  
	  Assert.assertNotEquals(a, b, "a and b values are matching, TC failed");
	  Reporter.log("a and b values are not matching, TC passed",true);
  }
}
  