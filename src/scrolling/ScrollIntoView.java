package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/");
			
			//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
			
		//	WebElement katraj = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
	        WebElement Media = driver.findElement(By.xpath("//h1[text()='Our Social Media']"));
			
	        JavascriptExecutor e = (JavascriptExecutor) driver;
		//	e.executeScript("arguments[0].scrollIntoView(true)",katraj);
			e.executeScript("arguments[0].scrollIntoView(true)", Media);
			

	}

}
