package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod() 
  {
	  String a="Amol";
	  String b="Amol";
	  
	  //To use soft assert we need to create object of SoftAssert class
	  
	  SoftAssert soft = new SoftAssert();   //created object of SoftAssert class
	  
	  soft.assertNotEquals(a, b, "Both value are equal, TC is failed");
	  soft.assertNull(b, "Value is not Null, TC is failed");
	  soft.assertAll();
  }
  
  @Test 
  public void testing()
  {
	  boolean a=true;
	  boolean b=false;
	  
	  SoftAssert s = new SoftAssert();
	  s.assertTrue(b,"value is false, TC failed");
	  s.assertFalse(a, "value is true, TC failed");
	  
	  s.assertAll();
  }
  
  
  
}
