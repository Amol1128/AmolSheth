package ListenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerStudy.ListenerClass.class)
public class TestClass {
  @Test
  public void a() {
	  Reporter.log("a running",true);
  }
  
  @Test
  public void b() {
	  //Assert.fail();
	  Reporter.log("b running",true);
  }
  
  @Test(dependsOnMethods = "b")
  public void c() {
	  Reporter.log("c running",true);
  }
}
