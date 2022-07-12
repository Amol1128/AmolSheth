package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File amz = new File("D:\\Screenshot\\MyScreenshot2.jpg");
		
		FileHandler.copy(Source, amz);

	}

}
