package IncludeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass2 {
	 @Test(groups = {"sanity"})
	  public void x() 
	  {
		  Reporter.log("x is running",true);
	  }
	  @Test(groups = {"regression"})
	  public void y() 
	  {
		  Reporter.log("y is running",true);
	  }
	  @Test(groups = {"sanity"})
	  public void z() 
	  {
		  Reporter.log("z is running",true);
	  }
}
