package ankit_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class practice001 {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String expectedTitle = "google";
		
		Assert.assertEquals(Title, expectedTitle, "Value are not matching, TC Failed");
		Reporter.log("Value are matching, TC passed",true);

	}

}
