package KiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import KiteUtility.UtilityProp;

public class BaseNew 
{
	protected WebDriver driver;
	public void openBrowser() throws IOException
	{
		//Browser SetUp(open browser)
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
	 ChromeOptions opt = new ChromeOptions();
//	 opt.addArguments("headless");
//	 opt.addArguments("disable-notifications");
	 opt.addArguments("incognito");
	 
	 driver = new ChromeDriver(opt);
	 driver.manage().window().maximize();
	 
	 driver.get(UtilityProp.getDataFromPropertyFile("URL"));
	 Reporter.log("Launching Browser",true);
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

}
