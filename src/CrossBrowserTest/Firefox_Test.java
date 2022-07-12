package CrossBrowserTest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox_Test {
  @Test
  public void myMethod() 
  {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\geckodriver.exe");
		
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			//Thread.sleep(2000);  
  }
}
