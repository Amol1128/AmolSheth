package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example01_TestNG {
  @Test
  public void MyMethod() throws InterruptedException 
  
  {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		System.out.println("Hi, i am Amol");
		Reporter.log("HI, I am Amol Gunjal");
		Reporter.log("Hi, I am Amol Gunjal From Nashik",true);
		
		
  }
  
  @Test
  public void MyMethod1()
  
  {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		Reporter.log("Hi, I am Google",true);
			
  }
  
  @Test
  public void method()
  {
	  Reporter.log("Hi Good Morning",true);
  }
}
