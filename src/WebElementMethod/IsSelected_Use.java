package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Use {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		WebElement checkbox1 = driver.findElement(By.name("checkBoxOption1"));
		checkbox1.click();
		
		if(checkbox1.isSelected())
		{
			System.out.println("checkbox is already selected");
		}
		else
		{
			//checkbox1.click();
			System.out.println("Checkbox is now selected");
		}

	}

}
