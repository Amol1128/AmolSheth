package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Use {

	public static void main(String[] args) throws InterruptedException
	{
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			  
			driver.findElement(By.xpath("//input[@value='Radio1']")).click();

	}

}
