 package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void myMethod()   //Hard assertion
  {
	  String a="Pune";
	  String b="Pune";
	  
	  Assert.assertNotEquals(a, b, "TC failed, value are equal");
	  
	  Assert.assertNotNull(b, "TC Failed, Value is null");
  }
}
 