package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(2000);
		
		List<WebElement> SearchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println(SearchResult.size());
		
		for(WebElement z:SearchResult)   //for getting text only
		{
			System.out.println(z.getText());
		}
		Thread.sleep(2000);
		
		for(WebElement result:SearchResult)   //for clicking on required result
		{
			String actualText = result.getText();
			String expectedText = "honda civic";
			
			if(actualText.equals(expectedText))
			{
				result.click();
				break;
			}
			
    }
		Thread.sleep(2000);
		driver.findElement(By.linkText("Images")).click();		

	}

}
