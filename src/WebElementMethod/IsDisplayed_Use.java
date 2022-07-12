package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Use {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		
		WebElement show = driver.findElement(By.id("show-textbox"));
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		
		if(textbox.isDisplayed())
		{
			System.out.println("Thank you Text box is displayed");
		}
		else
		{
			System.out.println("Cant find textbox");
		}
		
		hide.click();
		//show.click();
		
		if(textbox.isDisplayed())
		{
			System.out.println("Thank you Text box is displayed");
		}
		else
		{
			System.out.println("Cant find textbox");
		}
		
		
        //driver.manage().window().minimize();
	}

}
