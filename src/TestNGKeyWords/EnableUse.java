package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
	  @Test
	  public void c() 
	  {
		  Reporter.log("c is running",true);
	  }
	  @Test(enabled=false)
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
