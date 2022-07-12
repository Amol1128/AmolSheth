package IncludeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
	  @Test(groups = {"sanity"})
	  public void c() 
	  {
		  Reporter.log("c is running",true);
	  }
	  @Test(groups = {"regression"})
	  public void a() 
	  {
		  Reporter.log("a is running",true);
	  }
	  @Test(groups = {"sanity"})
	  public void v() 
	  {
		  Reporter.log("v is running",true);
	  }
}
