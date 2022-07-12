package TestNGKeyWords;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsUse {
	  @Test
	  public void c() 
	  {
		// Assert.fail();
		  Reporter.log("c is running",true);
	  }
	  @Test(dependsOnMethods = {"c"},priority=-2)
	  public void a() 
	  {
		  Reporter.log("a is running",true);
	  }
	  @Test
	  public void v() 
	  {
		  Reporter.log("v is running",true);
	  }
}
