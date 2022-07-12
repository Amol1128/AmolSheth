package TestNG_KeyWords_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass01 {
  @Test
  public void a() 
  {
	  //Assert.fail();
	  Reporter.log("a is running",true);
  }
  @Test(groups ={"Regression"})
  public void b() 
  {
	  
	  Reporter.log("b is running, regression",true);
  }
  @Test(groups ={"Sanity"})
  public void c() 
  {
	  
	  Reporter.log("c is running, sanity",true);
  }
  @Test(groups ={"Regression"})
  public void d() 
  {
	  
	  Reporter.log("d is running, regression",true);
  }
}
