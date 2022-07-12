package TestNG_KeyWords_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass02 {
	@Test(groups ={"Sanity"})
	  public void p() 
	  {
		  //Assert.fail();
		  Reporter.log("p is running, sanity",true);
	  }
	  @Test(groups ={"Regression"})
	  public void q() 
	  {
		  
		  Reporter.log("q is running, regression",true);
	  }
	  @Test(groups ={"Sanity"})
	  public void r() 
	  {
		  
		  Reporter.log("r is running, sanity",true);
	  }
	  @Test(groups ={"Regression"})
	  public void s() 
	  {
		  
		  Reporter.log("s is running, regression",true);
	  }
}
